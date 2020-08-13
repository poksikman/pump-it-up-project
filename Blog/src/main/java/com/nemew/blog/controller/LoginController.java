
package com.nemew.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/") // URL 주소 = root
	public String login() {		
		return "login"; // JSP 파일명
	}
}
