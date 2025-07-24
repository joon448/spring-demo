package com.example.demo;

import com.example.demo.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class MemberController {
    private final MemberService service;

    public MemberController(MemberService service) {
        this.service = service;
    }

    @PostMapping("/members")
    public String addMember(@RequestBody String name){
        String savedName = service.add(name);
        return "저장 완료: " + savedName;
    }

    @GetMapping("/members")
    public List<String> getMembers(){
        return service.getAll();
    }
}
