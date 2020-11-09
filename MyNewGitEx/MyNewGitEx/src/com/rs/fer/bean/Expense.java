package com.rs.fer.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="expenseid",length=10)
	private int expenseid;

	@Column(name="expensetype",length=10)
	private String expensetype;
	
	@Column(name="date",length=10)
	private String date;
	
	@Column(name="price",length=10)
	private String price;
	
	@Column(name="numberofitems",length=10)
	private String numberofitems;
	
	@Column(name="total",length=10)
	private String total;
	
	@Column(name="bywhom",length=10)
	private String bywhom;
	
	@Column(name="userid",length=10)
	private String userid;
	
	@Column(name="created",length=10)
	private String created;
	
	@Column(name="updated",length=10)
	private String updated;

	public int getExpenseid() {
		return expenseid;
	}

	public void setExpenseid(int expenseid) {
		this.expenseid = expenseid;
	}

	public String getExpensetype() {
		return expensetype;
	}

	public void setExpensetype(String expensetype) {
		this.expensetype = expensetype;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNumberofitems() {
		return numberofitems;
	}

	public void setNumberofitems(String numberofitems) {
		this.numberofitems = numberofitems;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getBywhom() {
		return bywhom;
	}

	public void setBywhom(String bywhom) {
		this.bywhom = bywhom;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

}	