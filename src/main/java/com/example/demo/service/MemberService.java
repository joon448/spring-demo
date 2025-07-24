package com.example.demo.service;

import com.example.demo.model.Member;
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

    public Member add(String name){
        return repository.save(name);
    }

    public List<Member> getAll() {
        return repository.findAll();
    }
}
