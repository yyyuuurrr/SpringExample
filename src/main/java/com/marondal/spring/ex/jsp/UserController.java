package com.marondal.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marondal.spring.ex.jsp.domain.User;
import com.marondal.spring.ex.jsp.service.UserService;

@RequestMapping("/jsp/user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// 이름, 생년월일, 이메일 전달 받고 상용자 정보 저장하는 기능
	@GetMapping("/create")
	public String createUser(
			@RequestParam("name")String name
			, @RequestParam("birthday")String birthday
			, @RequestParam("email")String email) {
		
		int count = userService.addUser(name, birthday, email);
		
		return "수행결과 : " + count;	
	}
		
	@GetMapping("/input")
	public String inputUser() {
		
		return "jsp/userInput";
		
	}
	
	@GetMapping("/last")
	public String lastUser(Model model) {
		
		User user = userService.getLastUser();
		
		model.addAttribute("result", user);
		
		return "jsp/userInfo";
	}
	
	

}
