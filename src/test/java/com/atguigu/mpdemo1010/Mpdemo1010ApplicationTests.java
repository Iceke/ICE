package com.atguigu.mpdemo1010;

import com.atguigu.mpdemo1010.entity.User;
import com.atguigu.mpdemo1010.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class Mpdemo1010ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    //查询USER表所有数据
    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
    @Test
     void addUser(){
        User user = new User();
        user.setName("luckcy");
        user.setAge(22);
        user.setEmail("luckcy@qq.com");
       int insert =  userMapper.insert(user);
        System.out.println("insert:"+insert);
    }
    @Test
    public void updateUser(){
        User user=new User();
        user.setId(2);
        user.setAge(99);
        int row = userMapper.updateById(user);
        System.out.println(row);
    }
}
