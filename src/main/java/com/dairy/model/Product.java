package com.dairy.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "CategoryName")
    private String categoryName;

    @Column(name = "CompanyName")
    private String companyName;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "ProductPrice")
    private Float productPrice;

    @Column(name = "PostingDate")
    private Timestamp postingDate;

    @Column(name = "UpdatingDate")
    private Timestamp updatingDate = Timestamp.from(Instant.now());

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public Timestamp getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Timestamp postingDate) {
		this.postingDate = postingDate;
	}

	public Timestamp getUpdatingDate() {
		return updatingDate;
	}

	public void setUpdatingDate(Timestamp updatingDate) {
		this.updatingDate = updatingDate;
	}

    
}