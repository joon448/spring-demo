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
        return repository.save(new Member(name));
    }

    public List<Member> getAll() {
        return repository.findAll();
    }

    public Member getById(Long id){
        return repository.findById(id).orElseThrow(()-> new RuntimeException("해당 회원이 없습니다."));
    }
}
