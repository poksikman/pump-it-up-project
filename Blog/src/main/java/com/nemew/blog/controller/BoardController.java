
package com.nemew.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nemew.blog.model.BoardModel;
import com.nemew.blog.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping("/list") // URL 주소
	public String list(Model model) {

		BoardModel board = boardService.printBoard();
		
		model.addAttribute("id", board.getId());
		model.addAttribute("subject", board.getSubject());
		model.addAttribute("content", board.getContent());
		model.addAttribute("regDate", board.getReg_date());
		
		return "list"; // JSP 파일명
	}
}
