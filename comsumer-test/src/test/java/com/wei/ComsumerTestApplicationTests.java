package com.wei;

import com.wei.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComsumerTestApplicationTests {

//    Dubbo 2.7.10 是个坑比版本！2.7.7才可以用！
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        userService.byTicket();
    }

}
