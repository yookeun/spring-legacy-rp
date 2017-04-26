package com.example.repl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HomeService {
	
	@Autowired
	private HomeDao dao;
	
	//@Transactional(readOnly = true)
	public List<TestTb> selectListR() {
		return dao.selectList();
	}
	
	//
	public List<TestTb> selectListW() {
		return dao.selectList();
	}	
	
	public int insertTestTb(TestTb testTb) {
		return dao.inserTestTb(testTb);
	}	
	
	@Transactional(readOnly = false)
	public TestTb selectOneId(int id) {
		return dao.selectOneId(id);
	}
	
	public int deleteAll() {
		return dao.deleteAll();
	}
	
	
}
