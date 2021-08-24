package com.solji.admin.controller.member;


import com.solji.admin.model.MemberResponse;
import com.solji.admin.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;


    @GetMapping("/{memberNo}")
    public MemberResponse findMember(@PathVariable long memberNo){
        return memberService.findMember(memberNo);
    }
}
