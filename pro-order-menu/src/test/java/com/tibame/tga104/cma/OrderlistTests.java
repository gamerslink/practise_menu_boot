package com.tibame.tga104.cma;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.tibame.tga104.cma.orderMenu.dao.OrderlistDAO;
import com.tibame.tga104.cma.orderMenu.model.OrderlistVO;

@SpringBootTest
public class OrderlistTests {
	@Autowired
	private OrderlistDAO orderlistDAO;

	/**
	 * 點餐
	 */
	@Test
	public void insert() {
		OrderlistVO orderlistVO = new OrderlistVO();
		orderlistVO.setOrderId(1);
		orderlistVO.setMenuId(1);
		orderlistVO.setMenuName("燙青菜");
		orderlistVO.setQuantity(3);
		orderlistVO.setPrice(100);
		orderlistVO.setTotalPrice(null);
		System.out.println(orderlistVO);
	}

	/**
	 * 調整點餐數量
	 */

	@Test
	public void testUpdate() {
		OrderlistVO orderlistVO = new OrderlistVO();
		orderlistVO.setOrderId(1);
		orderlistVO.setQuantity(6);
		OrderlistVO update = orderlistDAO.update(orderlistVO);
		System.out.println(update);
	}

	/**
	 * 訂單
	 */
	@Test
	public void testGetAll() {
		System.out.println(orderlistDAO.getAll());
	}

}
