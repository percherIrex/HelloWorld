package com.gdou;

import com.gdou.dao.UserMapper;
import com.gdou.entity.User;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class MybatisplusApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        //userMapper 里有各种方法

        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

        System.out.println("这里是自定义的方法使用注解");
        List<User> myUserList = userMapper.findAllUser();
        myUserList.forEach(System.out::println);

        System.out.println("这里是自定义的方法使用xml");
        List<User> myUser = userMapper.findUserXml();
        myUser.forEach(System.out::println);
    }

}
