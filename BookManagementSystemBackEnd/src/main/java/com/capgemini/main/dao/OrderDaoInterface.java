package com.capgemini.main.dao;

import java.util.List;

import com.capgemini.main.entites.OrderDetails;


public interface OrderDaoInterface {
	List<OrderDetails> listAllOrders();
	OrderDetails getOrderById(int id);
	boolean deleteOrderById(int id);
	boolean updateOrder(int id, String status);
}
