package com.mm.itempvuv.auth;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class UserRepository {

    public String getPasswordByUser(String name) {
        if (name.equals("ojc")) {
            return "mt@a10";
        }
        return null;
    }

    public Set<String> getRoleByUser(String user) {
        Set<String> role = new HashSet<>();
        if (user.equals("ojc")) {
            role.add("admin");
        }
        return role;
    }

    public Set<String> getPermByRole(String role) {
        Set<String> perm = new HashSet<>();
        if (role.equals("admin")) {
            perm.add("all");
        }
        return perm;
    }

}
