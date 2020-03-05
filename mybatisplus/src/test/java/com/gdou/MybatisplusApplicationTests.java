package com.gdou;

import com.gdou.dao.UserMapper;
import com.gdou.entity.User;
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

        
    }

}
