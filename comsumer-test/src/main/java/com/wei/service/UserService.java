package com.wei.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserService {
    @Reference
    TicketService ticketService;

    public void byTicket(){
        System.out.println("在注册中心拿到票=》》》》"+ticketService.getTicket());
    }
}
