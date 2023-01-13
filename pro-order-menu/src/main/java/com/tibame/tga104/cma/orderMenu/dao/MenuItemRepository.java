package com.tibame.tga104.cma.orderMenu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tibame.tga104.cma.orderMenu.model.MenuVO;

public interface MenuItemRepository extends JpaRepository<MenuVO, Integer> {
}
