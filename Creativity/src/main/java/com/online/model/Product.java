package com.online.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "product", schema = "prod")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRD_SEQ")
    @SequenceGenerator(name = "PRD_SEQ", sequenceName = "PRD_SEQ", allocationSize = 1)
    @Column(name = "product_id")
	private int productId;
	
	@Column(name = "brand_name")
	private String brandName;
	
	@Column(name = "mobile_model")
	private String mobileModel;
	
	@Column(name = "cost")
	private String cost;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "purchase_date")
	private Date purchaseDate;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getMobileModel() {
		return mobileModel;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", brandName=" + brandName + ", mobileModel=" + mobileModel
				+ ", cost=" + cost + ", purchaseDate=" + purchaseDate + "]";
	}

}
