package com.online.foodDelivery.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="of_food")
public class FoodModel {

	private long id;
	private long categoryId;
	private String categoryName;
	private long foodId;
	private String foodName;
	private long foodPrice;
	private long disscount;
	private String foodDescription;
	private long finalPrice;
	private String image;
	private long restaurantId;
	private String restaurantName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public long getFoodId() {
		return foodId;
	}

	public void setFoodId(long foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public long getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(long foodPrice) {
		this.foodPrice = foodPrice;
	}

	public long getDisscount() {
		return disscount;
	}

	public void setDisscount(long disscount) {
		this.disscount = disscount;
	}

	public String getFoodDescription() {
		return foodDescription;
	}

	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}

	public long getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(long finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

}
