package com.examly.springapp.tempmodel;

import java.util.List;

import com.examly.springapp.model.OrderModel;

public class OrderListModel {
	
	List<OrderModel> ordersList;

	public List<OrderModel> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<OrderModel> ordersList) {
		this.ordersList = ordersList;
	}

	@Override
	public String toString() {
		return "OrderListModel [ordersList=" + ordersList + "]";
	}
	
	
	

}
