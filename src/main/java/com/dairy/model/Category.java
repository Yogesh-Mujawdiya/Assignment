package com.dairy.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "CategoryName")
    private String categoryName;

    @Column(name = "CategoryCode")
    private String categoryCode;

    @Column(name = "PostingDate")
    private Timestamp postingDate;

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

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public Timestamp getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Timestamp postingDate) {
		this.postingDate = postingDate;
	}
    
    

}