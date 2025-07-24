package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class MemberController {
    private final List<String> members = new ArrayList<>();

    @PostMapping("/members")
    public String addMember(@RequestBody String name){
        members.add(name);
        return "저장 완료: "+name;
    }

    @GetMapping("/members")
    public List<String> getMembers(){
        return members;
    }
}
