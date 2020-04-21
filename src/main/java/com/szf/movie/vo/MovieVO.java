package com.szf.movie.vo;

import com.szf.movie.domain.Movie;

public class MovieVO extends Movie {
	private String startTime;
	private String endTime;
	private Double minPrice;
	private Double maxPrice;
	private Integer longTime;
	private Integer shortTime;
	private String orderName;
	private String orderMethod;
	

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderMethod() {
		return orderMethod;
	}

	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public Double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Integer getLongTime() {
		return longTime;
	}

	public void setLongTime(Integer longTime) {
		this.longTime = longTime;
	}

	public Integer getShortTime() {
		return shortTime;
	}

	public void setShortTime(Integer shortTime) {
		this.shortTime = shortTime;
	}

	
}
