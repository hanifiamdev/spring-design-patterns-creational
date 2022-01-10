package com.hanifiamdev.springcreational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype() {
        Employee hanif = applicationContext.getBean("employeeStaff", Employee.class);
        hanif.setName("Hanif");

        Employee orkhan = applicationContext.getBean("employeeStaff", Employee.class);
        orkhan.setName("Orkhan");

        Employee hafiza = applicationContext.getBean("employeeManager", Employee.class);
        hafiza.setName("Hafiza");

        Employee adiba = applicationContext.getBean("employeeVicePresident", Employee.class);
        adiba.setName("Adiba");

        System.out.println(hanif);
        System.out.println(orkhan);
        System.out.println(hafiza);
        System.out.println(adiba);


    }
}