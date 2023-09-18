package com.ncs.test.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncs.test.member.model.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;

	@RequestMapping("login")
	public String memberLogin() {
		return "redirect:/";
	}

}
