package com.weweb.service;

import com.weweb.command.MemberVO;

public interface MemberService {
	
	public int login(MemberVO vo);		// 로그인
	public int signUp(MemberVO vo);		// 회원가입
	public int emailCheck(String email); 		//이메일 확인 
}
