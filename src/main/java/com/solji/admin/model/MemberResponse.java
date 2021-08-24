package com.solji.admin.model;


public class MemberResponse {
    public MemberResponse(){
    }

    public MemberResponse(long memberNo){
        this.memberNo = memberNo;
    }


    public long memberNo;
    public String name;
    public String birthday;
    public String phoneNumber;
}
