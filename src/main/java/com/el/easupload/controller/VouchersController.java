package com.el.easupload.controller;

import com.el.easupload.service.ImportVouchers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class VouchersController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Resource
    ImportVouchers importVouchers;

    @RequestMapping("/import")
    public String importVouchers(@RequestParam String ukid) {
        log.info("=========import begin=====");
        String r=importVouchers.impVouchers(new BigDecimal(ukid));
        log.info("=========import end=====");

        return r;

    }


}
