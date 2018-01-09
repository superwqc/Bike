package com.minibike.bike.user.controller;

import com.minibike.bike.common.resp.ApiResult;
import com.minibike.bike.user.dao.UserMapper;
import com.minibike.bike.user.entity.LoginInfo;
import com.minibike.bike.user.entity.User;
import com.minibike.bike.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;


    @RequestMapping("/login")
    public ApiResult<String> login(@RequestBody LoginInfo loginInfo){
        ApiResult<String> resp =new ApiResult<>();

        String token =userService.login();

        return null;
    }
}
