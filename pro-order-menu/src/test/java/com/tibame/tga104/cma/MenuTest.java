package com.tibame.tga104.cma;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tibame.tga104.cma.orderMenu.dao.MenuDAO;

@SpringBootTest
public class MenuTest {
	@Autowired
	private MenuDAO menuDAO;
	
	
	/**
	 * 顯示菜單
	 * */
	
	@Test
	public void testGetAll() {
		System.out.println(menuDAO.getAll());
	}
	

}
