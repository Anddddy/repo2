package com.example.createtable1.controller;

import com.example.createtable1.pojo.UserInfo;
import com.example.createtable1.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/index")
    public String index() throws IOException,NullPointerException{

        return "index";
    }

    @RequestMapping("/createNewTable")
    public String createNewTable(HttpServletRequest request) throws IOException,NullPointerException{

        String tableName = request.getParameter("tableName");
        userInfoService.createNewTable(tableName);

        return "index";
    }
}
