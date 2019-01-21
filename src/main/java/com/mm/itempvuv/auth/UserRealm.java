package com.mm.itempvuv.auth;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserRepository userRepository;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String user = (String) authenticationToken.getPrincipal();
        System.out.println(user);
        String password = new String((char[]) authenticationToken.getCredentials());
        System.out.println(password);

        String pass = userRepository.getPasswordByUser(user);
        if (!pass.equals(password)) {
            throw new IncorrectCredentialsException();
        }
        return new SimpleAuthenticationInfo(user, password, getName());
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String user = (String) super.getAvailablePrincipal(principalCollection);
        Set<String> roles = userRepository.getRoleByUser(user);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roles);
        for (String role : roles) {
            Set<String> perm = userRepository.getPermByRole(role);
            info.setStringPermissions(perm);
        }
        return info;
    }
}
