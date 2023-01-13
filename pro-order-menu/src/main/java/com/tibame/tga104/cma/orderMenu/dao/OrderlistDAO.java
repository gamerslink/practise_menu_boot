package com.tibame.tga104.cma.orderMenu.dao;

import java.util.List;

import com.tibame.tga104.cma.orderMenu.model.OrderlistVO;

public interface OrderlistDAO {
	public OrderlistVO insert(OrderlistVO orderlistVO);
	public OrderlistVO update(OrderlistVO orderlistVO);
	public void delete(Integer orderId);
	public List<OrderlistVO> getAll();
	public OrderlistVO updateOne(Integer orderId, Integer quantity);
	public OrderlistVO findByPK(Integer orderId);
	
}
