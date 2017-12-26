package com.example.Controller;

import com.example.Mapper.UserMapper;
import com.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/up")
@Controller
public class UpFileController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/upfile")
    public String upfile(ModelMap map){
       return "page/index";
    }

    @RequestMapping("/scwj")
    public void scwj(){


    }
}
