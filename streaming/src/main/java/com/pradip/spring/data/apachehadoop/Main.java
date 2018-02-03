package com.pradip.spring.data.apachehadoop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Patil Pradip
 */
public class Main {
    public static void main(String[] arguments) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
