package com.bean;

import java.util.Date;

public class BeanRepresentingTable implements java.io.Serializable{
	private static final long serialVersionUID = 1L;

	Integer idKey;
	Date date;
	public Integer getIdKey() {
		return idKey;
	}
	public void setIdKey(Integer idKey) {
		this.idKey = idKey;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
