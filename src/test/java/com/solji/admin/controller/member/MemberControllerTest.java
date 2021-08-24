package com.solji.admin.controller.member;

import com.solji.admin.controller.member.MemberController;
import com.solji.admin.model.MemberResponse;
import com.solji.admin.service.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@WebMvcTest(MemberController.class)
class MemberControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MemberService memberService;


    @Test
    @DisplayName("회원조회 정상 테스트")
    void findMember() throws Exception {
        // given
        long memberNo = 2L;

        Mockito
                .when(
                        memberService.findMember(memberNo)
                )
                .thenReturn(
                        new MemberResponse(memberNo)
                );

        // when
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/member/" + memberNo));

        // then
        resultActions
                .andExpect(
                        MockMvcResultMatchers.status().isOk()
                )
                .andExpect(
                        jsonPath("$.memberNo", is((int) memberNo))
                )
                .andDo(
                        MockMvcResultHandlers.print()
                );
    }

    @Test
    @DisplayName("회원정보 없을 때 테스트")
    void findMemberWhenNotFoundMember() throws Exception {
        // given

        // when

        // then
    }
}
