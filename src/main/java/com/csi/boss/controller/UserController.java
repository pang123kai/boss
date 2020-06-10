package com.csi.boss.controller;

import com.csi.boss.entity.Users;
import com.csi.boss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/new")
    public ModelAndView method(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("new");
        mav.addObject("nums",100);
        return mav;
    }
    @RequestMapping("/all")
    @ResponseBody
    public List<Users> getAll(){
        return userService.getAll();
    }


}

