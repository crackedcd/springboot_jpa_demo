package com.mm.itempvuv.controller;

import com.mm.itempvuv.service.TestService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("user") String user, @RequestParam("password") String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(user, password);
        token.setRememberMe(true);
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.login(token);

        // controller跳转
        return "redirect:/index";
        /*
        或者在类有@RestController修饰 或 方法有@ResponseBody修饰的情况下,
        增加方法参数HttpServletResponse response, 使用response.sendRedirect("some-url"); 跳转
         */
    }

    @RequiresAuthentication
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public void logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
    }

    @ResponseBody
    @RequestMapping("/unauthorized")
    public String read() {
        return "<h1>unauthorized</h1>";
    }

    @RequestMapping(value = "/home")
    public String home() throws Exception {
        return "home";
    }

    @RequiresAuthentication
    @RequestMapping(value = "index")
    public String index() throws Exception {
        return "index";
    }
}
