package com.gdou.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdou.entity.User;

/*
    继承mybatisplus的接口可快速使用CRUD，不需要写映射文件
 */
public interface UserMapper extends BaseMapper<User> {
}
