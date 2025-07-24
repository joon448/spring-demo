package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private final List<String> members = new ArrayList<>();

    public String add(String name){
        members.add(name);
        return name;
    }

    public List<String> getAll() {
        return members;
    }
}
