package com.example.demo;

import com.example.demo.Dao.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest
class DemoApplicationTests {
    @Autowired
    TestMapper mapper;
    @Test
    void contextLoads() {
        System.out.println(mapper.select().get(3).getName());
        System.out.println("haha");
    }

}
