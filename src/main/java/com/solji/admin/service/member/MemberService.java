package com.solji.admin.service.member;

import com.solji.admin.model.MemberResponse;
import org.springframework.stereotype.Service;


@Service
public class MemberService {
    public MemberResponse findMember(long memberNo){
        return new MemberResponse(memberNo);
    }
}
