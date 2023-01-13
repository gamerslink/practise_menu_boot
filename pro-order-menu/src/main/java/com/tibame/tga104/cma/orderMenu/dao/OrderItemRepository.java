package com.tibame.tga104.cma.orderMenu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tibame.tga104.cma.orderMenu.model.OrderlistVO;



public interface OrderItemRepository extends JpaRepository<OrderlistVO, Integer> {
}

