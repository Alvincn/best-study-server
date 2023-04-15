package com.example.bestStudy.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bestStudy.domain.User;
import com.example.bestStudy.mapper.UserMapper;
import com.example.bestStudy.service.IUserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService{
}
