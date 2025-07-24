package com.example.demo.service;

import com.example.demo.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private final MemberRepository repository;

    public  MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public String add(String name){
        repository.save(name);
        return name;
    }

    public List<String> getAll() {
        return repository.findAll();
    }
}
