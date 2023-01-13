package com.tibame.tga104.cma.orderMenu.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tga104.cma.orderMenu.dao.MenuDAO;
import com.tibame.tga104.cma.orderMenu.model.MenuVO;

@Service
@Transactional
public class MenuService {
	@Autowired
	private MenuDAO dao;

	
	public List<MenuVO> getAll(){
		return dao.getAll();
	}

}
