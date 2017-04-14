package com.example.repl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
	
	@Autowired
	private HomeDao dao;
	
	public List<TestTb> selectList() {
		return dao.selectList();
	}
}
