package org.example.rajnish;

import org.example.rajnish.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test {
    public static void main(String args[]){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AspectConfig.class);
        ctx.refresh();
        UserService userService = ctx.getBean(UserService.class);
        userService.multiply(2, 3);

        userService.devide(5,0);
    }
}