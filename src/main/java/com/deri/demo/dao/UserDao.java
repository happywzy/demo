package com.deri.demo.dao;

import com.deri.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2021/1/21 18:54
 * @Version: v1.0
 **/
public interface UserDao {

    @Insert("insert into t_user (user_name, age) values " +
            "(#{userName}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int addUser(User user);

    @Select("select * from t_user")
    @ResultType(User.class)
    List<User> getAllUser();

}
