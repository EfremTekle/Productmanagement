package edu.mum.cs.cs425.prodmgmt.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name= "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productid")
	private  long pid; 
	private long productNumber;
	private String name;
	private float unitPrice;
	
	@Column(name="datemanufactured")
	private LocalDate dateMfd;
	public Product(long productNumber, String name, float unitPrice, LocalDate dateMfd) {
		super();
		this.productNumber = productNumber;
		this.name = name;
		this.unitPrice = unitPrice;
		this.dateMfd = dateMfd;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(long productNumber) {
		this.productNumber = productNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public LocalDate getDateMfd() {
		return dateMfd;
	}
	public void setDateMfd(LocalDate dateMfd) {
		this.dateMfd = dateMfd;
	}


}
