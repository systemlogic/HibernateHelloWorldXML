package com.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID") }, name="HelloTable")
public class BeanRepresentingTable implements java.io.Serializable{
	@Id
	@Column(name="ID" ,unique=true ,nullable=false)
	Integer idKey;

	@Column(name="DATE",nullable=false)
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
