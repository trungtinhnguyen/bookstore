package com.example.controller.web;

import com.example.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping (name = "webHomeController", value = "/trang-chu")
    public ModelAndView homePage () {
        return new ModelAndView("web/home");
    }
}
