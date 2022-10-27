package com.weweb.service;

import com.weweb.command.MemberVO;

public interface MemberService {
	
	public MemberVO login(MemberVO vo);		// 로그인
	public int signUp(MemberVO vo);		// 회원가입
	public int emailCheck(String email);
	public int newPassWord(MemberVO vo);
	public int deleteMember(MemberVO vo);
	
}
