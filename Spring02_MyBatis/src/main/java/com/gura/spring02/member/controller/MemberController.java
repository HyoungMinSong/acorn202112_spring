package com.gura.spring02.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/member/list.do")
	public String list() {
		//1. dao를 이용해서 DB에서 회원 목록을 얻어온다.
		
		//2. 회원목록을 request scope에 담는다.
		
		//3. view page로 forward 이동해서 회원목록을 응답한다.
		
		
		return null;
	}
}
