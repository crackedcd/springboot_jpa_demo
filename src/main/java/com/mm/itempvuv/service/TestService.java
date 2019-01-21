package com.mm.itempvuv.service;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String read() {
        return "reading...";
    }

    public String write() {
        return "writting...";
    }
}
