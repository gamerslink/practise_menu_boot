package com.tibame.tga104.cma.orderMenu.dao;

import java.util.List;

import com.tibame.tga104.cma.orderMenu.model.MenuVO;

public interface MenuDAO {
	public abstract List<MenuVO> getAll();
}
