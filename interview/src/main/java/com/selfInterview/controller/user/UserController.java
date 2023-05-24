package com.selfInterview.controller.user;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.selfInterview.dto.User;
import com.selfInterview.service.user.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@Tag(name = "users", description = "유저 api")
@RequiredArgsConstructor
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/api/user/idCheck")
	public void idCheck(HttpServletResponse resp, @RequestParam String id) throws IOException {
		System.out.println("idCheck 실행");
		System.out.println(id);
		System.out.println(userService.idCheck(id));
		resp.getWriter().print(userService.idCheck(id));
	}
}
