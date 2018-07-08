package com.example.sericefeign.Service;

import org.springframework.stereotype.Component;

@Component
public class FeignHysric implements FeignService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,feignHysric" + name;
    }
}
