package com.example.Controller;

import com.example.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.Service.UserService;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/index")
    public String index(ModelMap map){
       List<Map<String ,Object>> list = userMapper.findName("黄宇");
        for (Map<String ,Object> ob:list ) {
            System.out.print(ob.get("username"));
       }
        map.addAttribute("name","huangyu");
        map.addAttribute("list",list);
        userService.createJdbcUser();
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login/login";
    }
}
