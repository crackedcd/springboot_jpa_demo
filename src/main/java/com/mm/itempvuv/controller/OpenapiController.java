package com.mm.itempvuv.controller;

import com.mm.itempvuv.jpa.qbi.model.PayModel;
import com.mm.itempvuv.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OpenapiController {

    @Autowired
    private PayService payService;

    @RequestMapping(value = "/openapi/payData", method = {RequestMethod.POST, RequestMethod.GET})
    public Map<String, Object> payData() throws Exception {
        return payService.openData();
    }

}
