package com.atguigu.mpdemo1010.mapper;

import com.atguigu.mpdemo1010.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
