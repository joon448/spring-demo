package com.example.demo.model;

public class MemberDto {
    private String name;

    public MemberDto(){}

    public MemberDto(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
