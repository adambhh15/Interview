package com.selfInterview.controller.user.page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "userPage",description = "유저 페이지 이동")
@RequiredArgsConstructor
@RestController
public class UserPageController {
	
	@GetMapping("/api/page/login")
	public ModelAndView moveToLogin(ModelAndView mav) {
		System.out.println("userPage-login 실행");
		mav.setViewName("login");
		return mav;
	}
	@GetMapping("/api/page/insert")
	public ModelAndView moveToInsert(ModelAndView mav) {
		System.out.println("userPage-insert 실행");
		mav.setViewName("insertUser");
		return mav;
	}
}
