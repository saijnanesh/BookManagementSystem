package com.capgemini.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.main.dao.OrderDaoInterface;
import com.capgemini.main.entites.OrderDetails;


@Service
public class OrderServiceImplementation implements OrderServiceInterface{
	@Autowired
	OrderDaoInterface orderDao;
	
	@Override
	public List<OrderDetails> listAllDetails() {
		return orderDao.listAllOrders();
	}

	@Override
	public OrderDetails getOrderById(int id) {
		return orderDao.getOrderById(id);
	}

	@Override
	public boolean deleteOrderById(int id) {
		
		return orderDao.deleteOrderById(id);
	}

	@Override
	public boolean updateOrder(int id, String status) {
		return orderDao.updateOrder(id, status);
	}

}
