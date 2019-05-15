package com.mybatis.mapper;

import com.mybatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Mapper
public interface UserMapper {

    void insertUser(User user);

    @Insert("insert into t_user(username,password) values(#{user.username},#{user.password})")
    @Options(useGeneratedKeys = true, keyProperty = "user.id")
    int insert(@Param("user") User user);
}
