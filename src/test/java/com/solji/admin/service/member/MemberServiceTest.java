package com.solji.admin.service.member;

import com.solji.admin.model.MemberResponse;
import com.solji.admin.service.member.MemberService;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;


@WebMvcTest(MemberService.class)
class MemberServiceTest {
    @Autowired
    private MemberService memberService;


    @Test
    public void findMember() {
        // given
        long memberNo = 1L;

        // when
        MemberResponse memberResponse = memberService.findMember(memberNo);

        // then
        MatcherAssert.assertThat(memberResponse.memberNo, CoreMatchers.is(memberNo));
        MockMvcResultHandlers.print();
    }
}
