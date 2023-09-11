package com.kh.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.mvc.model.service.MemberService;
import com.kh.mvc.model.vo.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping("search")
	public String search() {
		return "search";
	}
	
	@RequestMapping("find")
	public String find(String keyword, Model model) {
		List<Member> list = service.findMember(keyword);
		
		if(list.size() > 0) {
			model.addAttribute("list", list);
			return "find_ok";
		}
		return "find_fail";
	}
	
	@RequestMapping("register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("signUp")
	public String signUp(Member member) {
		service.registerMember(member);
		return "redirect:/";
	}
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("signIn")
	public String signIn(Member vo, HttpSession session) {
		Member member = service.login(vo);
		
		if(member != null) {
			session.setAttribute("vo", member);
		}
		
		return "loging_result";
	}
	
	@RequestMapping("allMember")
	public String allMember(Model model) {
		List<Member> list = service.showAllMember();
		model.addAttribute("list", list);
		return "find_ok";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		if(session.getAttribute("vo")!=null) {
			session.invalidate();
		}
		
		return "redirect:/";
	}
	
	@RequestMapping("update")
	public String update() {
		return "upate";
	}
	
	@RequestMapping("updateMember")
	public String updateMember(Member vo, HttpSession session) {
		service.updateMember(vo);
		if(session.getAttribute("vo")!=null) {
			session.setAttribute("vo", vo);
		}
		return "redirect:/";
	}
	
}
