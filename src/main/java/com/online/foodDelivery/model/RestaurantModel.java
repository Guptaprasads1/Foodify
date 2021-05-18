package com.online.foodDelivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="of_restaurant")
public class RestaurantModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="")
	private long restaurantUserId;
	
	@Column(name="restaurantUserName")
	private String restaurantUserName;
		
	@Column(name="")
	private long restaurantId;
	@Column(name="")
	private String restaurantName;
	@Column(name="")
	private String address;
	@Column(name="")
	private String city;
	@Column(name="")
	private String description;
	@Column(name="")
	private String rating;
	@Column(name="")
	private String image;
	@Column(name="")
	private String contactNo;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRestaurantUserName() {
		return restaurantUserName;
	}

	public void setRestaurantUserName(String restaurantUserName) {
		this.restaurantUserName = restaurantUserName;
	}

	public long getRestaurantUserId() {
		return restaurantUserId;
	}

	public void setRestaurantUserId(long restaurantUserId) {
		this.restaurantUserId = restaurantUserId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContectNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
