package com.deri.demo.controller;

import com.deri.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2021/1/21 19:20
 * @Version: v1.0
 **/
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/list")
    public String getAllUser(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "list";

    }

}
