package com.chenhuan.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/")//这里斜杠表示什么都不输就直接返回 否则需要在url中手动添加匹配内容
    //这句是HI作为get方法的起手式  例如：http://localhost:1314/HI?name=wanxuan 起手的后面是name
    public  String Hello()
    {
        //往前台传数据
        //return 表示重定向到这个方法并返回
        return "index";
    }
}
