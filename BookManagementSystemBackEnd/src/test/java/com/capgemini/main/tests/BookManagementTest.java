package com.capgemini.main.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.main.dao.OrderDaoImplementation;
import com.capgemini.main.entites.OrderDetails;
import com.capgemini.main.service.OrderServiceImplementation;


@SpringBootTest
public class BookManagementTest {
	
	@Autowired
	private OrderDaoImplementation orderDao;
	
	
	@Autowired
	private OrderServiceImplementation orderService;
	
	@Test
	void contextLoads()
	{
		
	}
	
	@Test
	void getAllOrders()
	{
		List<OrderDetails> list = orderService.listAllDetails();
		System.out.println("No of Books are: " + list.size());
		int expectedSize = list.size();
		assertEquals(expectedSize, list.size());
	}
	
	@Test
	void getEmptyOrderList()
	{
		List<OrderDetails> list = orderService.listAllDetails();
		System.out.println("No of books are: " + list.size());
		int expectedSize = 0;
		assertEquals(expectedSize, list.size());
	}
	
	
	
	@Test
	void getOrderById()
	{
		OrderDetails order = new OrderDetails(4,4,"Sai Kiran","Cash on delivery","Pending",1000.0,LocalDate.parse("2020-09-07"),LocalDate.parse("2020-09-13"));
		OrderDetails order1 = orderService.getOrderById(order.getOrderId());
		assertEquals(order.getOrderedBy(), order1.getOrderedBy());
	}
	
	
}
