package com.gdou.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdou.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
    继承mybatisplus的接口可快速使用CRUD，不需要写映射文件
 */
public interface UserMapper extends BaseMapper<User> {

    //这里是要自己写sql的
    @Select("select* from user")
    List<User> findAllUser();

    //这里是xml要用的 mapper.xml放在同一目录的 若报错去看pom.xml
    List<User> findUserXml();
}
