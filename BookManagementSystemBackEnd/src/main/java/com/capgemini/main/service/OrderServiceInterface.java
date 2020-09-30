package com.capgemini.main.service;

import java.util.List;

import com.capgemini.main.entites.OrderDetails;


public interface OrderServiceInterface {
	List<OrderDetails> listAllDetails();
	OrderDetails getOrderById(int id);
	boolean deleteOrderById(int id);
	boolean updateOrder(int id,String status);
}
