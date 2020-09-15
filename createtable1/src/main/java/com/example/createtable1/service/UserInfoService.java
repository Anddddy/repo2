package com.example.createtable1.service;

import com.example.createtable1.mapper.UserInfoMapper;
import com.example.createtable1.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public int createNewTable(String tableName){
        return userInfoMapper.createNewTable(tableName);
    }
}
