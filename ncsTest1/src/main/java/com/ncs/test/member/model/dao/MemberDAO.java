package com.ncs.test.member.model.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.ncs.test.member.model.vo.Member;

public class MemberDAO {

	@Autowired
	private Member member;
	
	public String login() {
	return ("membermapper.login");	
	}
	
}
