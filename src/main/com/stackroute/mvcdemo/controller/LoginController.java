package main.com.stackroute.mvcdemo.controller;

import main.com.stackroute.mvcdemo.model.LoginBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

    @Controller
    public class LoginController {
        @RequestMapping(value = "/", method = RequestMethod.GET)
        public ModelAndView showForm() {
            ModelAndView model = new ModelAndView("index");
            model.addObject("user", new User());
            return model;
        }

        @RequestMapping(value="/submit",method = RequestMethod.POST)
        public String submit(@ModelAttribute("user") User user, Model model){
            model.addAttribute("name", user.getUsername());
            return "output";
        }
    }

