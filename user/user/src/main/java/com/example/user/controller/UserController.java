package com.example.user.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.user.bean.UserBean;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping(value = "/login", params = {"UserId", "Password"})
    public String submitLoginByGet(Model model, @RequestParam(value = "UserId") String userid,
                                            @RequestParam(value = "Password") String password) {
        return "login";
    }    

    // https://velog.io/@faulty337/Spring-GET-POST-%EC%9E%90%EC%9B%90-%EB%B0%9B%EA%B8%B0
    @PostMapping(value = "/login/case1")
    public String submitLoginByPost(Model model, @RequestParam(value = "UserId") String userid,
                                                @RequestParam(value = "Password") String password) {
        return "login";
    }

    @PostMapping(value = "/login")
    public String submitLoginByPostBean(Model model, UserBean user) {
        return "login";
    }
}
