
package com.nemew.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nemew.blog.dao.BoardDao;
import com.nemew.blog.model.BoardModel;
import com.nemew.blog.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao dao;
	
	@Override
	public BoardModel printBoard() {
		BoardModel board = dao.getBoard();
		return board;
	}
}
