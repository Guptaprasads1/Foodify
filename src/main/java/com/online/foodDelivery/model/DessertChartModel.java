package com.online.foodDelivery.model;

public class DessertChartModel {

	private long userId;
	private String UserName;
	private long dessertId;
	private String dessertName;
	private long chartId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public long getDessertId() {
		return dessertId;
	}

	public void setDessertId(long dessertId) {
		this.dessertId = dessertId;
	}

	public String getDessertName() {
		return dessertName;
	}

	public void setDessertName(String dessertName) {
		this.dessertName = dessertName;
	}

	public long getChartId() {
		return chartId;
	}

	public void setChartId(long chartId) {
		this.chartId = chartId;
	}
}
