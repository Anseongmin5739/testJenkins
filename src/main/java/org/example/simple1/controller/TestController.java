package org.example.simple1.controller;

import org.example.simple1.dto.MemberDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class TestController {
    @GetMapping("/")
    public MemberDto test() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test");
        memberDto.setAge(20);
        return memberDto;
    }

    @GetMapping("/test/sm")
    public Map<String,String> testSm() {
        return Map.of("성민","창호");
    }
}