package com.Manager.model;

public class Item {
	private Integer id;
	private String name;
	private Double price;
	private String unit;
	
	public Item() {
		
	}

	public Item(Integer id, String name, Double price, String unit) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.unit = unit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", unit=" + unit + "]";
	}
	
	
}
