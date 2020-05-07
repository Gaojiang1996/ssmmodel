package com.lost.controller;

import com.lost.pojo.User;
import com.lost.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service = null;
    @ResponseBody
    @RequestMapping("/getuser/{id}")
    public User getUser(@PathVariable("id") long id){
        return service.getUser(id);
    }
}
