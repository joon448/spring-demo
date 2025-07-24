package com.example.demo.repository;

import com.example.demo.model.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemberRepository {
    private final Map<Long, Member> store = new HashMap<>();
    private long sequence = 0L;

    public Member save(String name){
        Member member = new Member(++sequence, name);
        store.put(member.getId(), member);
        return member;
    }

    public List<Member> findAll(){
        return new ArrayList<>(store.values());
    }
}
