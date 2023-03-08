package com.example.springbootconfigandsecretsmanagedbydoppler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootconfigandsecretsmanagedbydoppler.config.AppConfig;

@RestController
public class AppController {

    @Autowired
    AppConfig appConfig;

    @GetMapping("/")
    public String getAppConfig() {
        return appConfig.toString();
    }
    
}
