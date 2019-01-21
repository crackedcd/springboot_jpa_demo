package com.mm.itempvuv.controller;

import com.mm.itempvuv.service.PvUvService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PvUvController {

    @Autowired
    private PvUvService pvUvService;

    @RequiresAuthentication
    @ResponseBody
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getInfo(@RequestParam(value = "ds", required = false, defaultValue = "nothing") String ds) {
        return pvUvService.test(ds);
    }

}
