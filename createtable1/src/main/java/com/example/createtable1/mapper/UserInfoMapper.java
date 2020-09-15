package com.example.createtable1.mapper;

import com.example.createtable1.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserInfoMapper {

    @Update("create table ${tableName} (id int(11),name varchar(25),age int(11))")
    int createNewTable(@Param("tableName")String tableName);
}
