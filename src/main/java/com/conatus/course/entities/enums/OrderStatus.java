package com.conatus.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	private OrderStatus(int code) {
		this.code=code;
	}
	
	public int getCode() {//Método para retornar o código da enumeração para o mundo exterior, ex: Banco de dados
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value: OrderStatus.values()) {
			if(value.getCode()==code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus Code");
	}
}
