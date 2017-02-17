package com.custom.anotation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dinusha on 13/02/17.
 */

@RestController
public class HelloController {


    @Alow({"group1","group2"})
    @RequestMapping("/hello")
    public String hello(){
        String comment = "hello world, only can access security group with 'group1 & group2'";
        return  comment;
    }



    @Alow
    @RequestMapping("/hello2")
    public String hello2(){

        return  "Hello two, open access";
    }
}
