package com.weweb.mapper;

import com.weweb.command.MemberVO;

public interface MemberMapper {
	
	public MemberVO login(MemberVO vo); 	// 로그인
	public int signUp(MemberVO vo);	// 회원가입
}
