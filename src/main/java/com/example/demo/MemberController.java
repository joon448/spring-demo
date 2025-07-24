package com.example.demo;

import com.example.demo.dto.MemberDto;
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
    public String addMember(@RequestBody MemberDto dto) {
        String savedName = service.add(dto.getName());
        return "저장 완료: " + savedName;
    }

    @GetMapping("/members")
    public List<String> getMembers(){
        return service.getAll();
    }
}
