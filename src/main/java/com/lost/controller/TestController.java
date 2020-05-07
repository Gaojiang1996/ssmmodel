package com.lost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gj
 *  this is a test controller
 */
@Controller
@RequestMapping("/index")
public class TestController {
    @RequestMapping("/i")
    public String testMethod(){
        return "test";
    }

}
