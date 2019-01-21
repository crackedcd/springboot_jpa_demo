package com.mm.itempvuv.controller;

import com.mm.itempvuv.service.PayService;
import com.mm.itempvuv.service.PvUvService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PayDataController {

    @Autowired
    private PayService payService;

    @RequiresAuthentication
    @RequestMapping(value = "/realtime", method = RequestMethod.GET)
    public String getInfo(ModelMap m) throws Exception {
        m.addAttribute("data", payService.getData());
        return "realtime";
    }

}
