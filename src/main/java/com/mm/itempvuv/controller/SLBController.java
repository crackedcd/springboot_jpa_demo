package com.mm.itempvuv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SLBController {

    @ResponseBody
    @RequestMapping("/slb.html")
    public String slb() {
        return "SLB check OK!";
    }

}
