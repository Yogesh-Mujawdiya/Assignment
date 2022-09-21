package com.dairy.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "admin")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "AdminName")
    private String adminName;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "MobileNumber")
    private String mobileNumber;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "AdminRegDate")
    private Timestamp adminRegDate;

    @Column(name = "UpdatingDate")
    private Timestamp updatingDate = Timestamp.from(Instant.now());

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getAdminRegDate() {
		return adminRegDate;
	}

	public void setAdminRegDate(Timestamp adminRegDate) {
		this.adminRegDate = adminRegDate;
	}

	public Timestamp getUpdatingDate() {
		return updatingDate;
	}

	public void setUpdatingDate(Timestamp updatingDate) {
		this.updatingDate = updatingDate;
	}

    
}