package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class MemberRepository {
    private final List<String> members = new ArrayList<>();

    public void save(String name){
        members.add(name);
    }

    public List<String> findAll(){
        return members;
    }
}
