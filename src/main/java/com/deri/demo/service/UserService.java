package com.deri.demo.service;

import com.deri.demo.common.Code;
import com.deri.demo.config.Config;
import com.deri.demo.dao.UserDao;
import com.deri.demo.dto.BaseResponse;
import com.deri.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2021/1/21 18:52
 * @Version: v1.0
 **/
@Service
@Slf4j
public class UserService {
    @Resource
    UserDao userDao;

    @Autowired
    Config config;

    public BaseResponse addUser(User user) {
        BaseResponse response = new BaseResponse(Code.SUCCESS);
        if (user.getAge() < config.getLimit()){
            response.setCodeAndMsg(Code.USERAGE_LIMIT);
            return response;
        }
        try {
            userDao.addUser(user);
        } catch (DuplicateKeyException e1){
            response.setCodeAndMsg(Code.USERNAME_REPEAT);
            return response;
        } catch(Exception e) {
            response.setCodeAndMsg(Code.FAILD);
            return response;
        }
        log.info("add user");
        return response;
    }

    public List<User> getAllUser(){
        return userDao.getAllUser();
    }
}
