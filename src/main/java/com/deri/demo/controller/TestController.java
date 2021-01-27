package com.deri.demo.controller;

import com.deri.demo.dto.BaseResponse;
import com.deri.demo.entity.User;
import com.deri.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: TestController
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2021/1/21 18:43
 * @Version: v1.0
 **/
@RestController
public class TestController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public BaseResponse addUser(@RequestBody User user){
        return userService.addUser(user);
    }

}
