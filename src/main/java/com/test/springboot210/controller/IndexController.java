package com.test.springboot210.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Time
 * @date 2018-11-30 17:43
 * @desc
 */
@Controller
public class IndexController {
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView view=new ModelAndView("index");
        view.addObject("userName","汪应昌");
        return view;
    }
}
