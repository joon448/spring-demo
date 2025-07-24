package com.example.demo;

import com.example.demo.model.Member;
import com.example.demo.model.MemberDto;
import com.example.demo.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {
    private final MemberService service;

    public MemberController(MemberService service) {
        this.service = service;
    }

    @PostMapping("/members")
    public Member addMember(@RequestBody MemberDto dto) {
        return service.add(dto.getName());
    }

    @GetMapping("/members")
    public List<Member> getMembers(){
        return service.getAll();
    }

    @GetMapping("/members/{id}")
    public Member getMember(@PathVariable Long id){
        return service.getById(id);
    }

    @PutMapping("/members/{id}")
    public Member updateMember(@PathVariable Long id, @RequestBody MemberDto dto){
        return service.update(id, dto.getName());
    }
}
