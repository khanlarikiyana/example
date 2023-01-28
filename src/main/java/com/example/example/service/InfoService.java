package com.example.example.service;

import org.springframework.stereotype.Service;

@Service
public class InfoService {
    public String getInfo(String name){
        System.out.println(name);
        return "Hello"+name;
    }
}
