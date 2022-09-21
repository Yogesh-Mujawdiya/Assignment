package com.dairy.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "category")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "ProductId")
    private Integer productId;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "InvoiceNumber")
    private Integer invoiceNumber;

    @Column(name = "CustomerName")
    private String customerName;

    @Column(name = "CustomerContactNo")
    private String customerContactNo;

    @Column(name = "PaymentMode")
    private String paymentMode;

    @Column(name = "InvoiceGenDate")
    private Timestamp updatingDate = Timestamp.from(Instant.now());

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(String customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Timestamp getUpdatingDate() {
		return updatingDate;
	}

	public void setUpdatingDate(Timestamp updatingDate) {
		this.updatingDate = updatingDate;
	}
    
    

}