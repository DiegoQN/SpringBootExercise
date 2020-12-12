package com.mx.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Numbers")
public class Number implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="primeNumber")
	private String primeNumber;
	
	@Column(name="evenNumber")
	private String evenNumber;
	
	@Column(name="factorial")
	private Integer factorial;
	
	public Number() {	
	}
	
	public Number (Integer id) {
		this.id=id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id=id;
	}
	
	public String getPrimeNumber() {
		return primeNumber;
	}

	public void setPrimeNumber(String primeNumber) {
		this.primeNumber = primeNumber;
	}

	public String getEvenNumber() {
		return evenNumber;
	}
	
	public void setEvenNumber(String evenNumber) {
		this.evenNumber = evenNumber;
	}

	public Integer getFactorial() {
		return factorial;
	}

	public void setFactorial(Integer factorial) {
		this.factorial = factorial;
	}

}