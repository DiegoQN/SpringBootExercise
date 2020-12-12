package com.mx.bean;

import java.io.Serializable;

public class NumberBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String primeNumber;
	
	private String evenNumber;
	
	private Integer factorial;
	
	public NumberBean() {	
	}
	
	public NumberBean(Integer id) {
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