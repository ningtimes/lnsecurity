package com.ningtime.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yr_ln on 2018/6/19.
 */
@Controller
@RequestMapping
public class MainController {

    @RequestMapping("/error")
    public String error(){
        return "error";
    }

    @RequestMapping("/userLogin")
    public String userLogin(){
        return "login";
    }
}
