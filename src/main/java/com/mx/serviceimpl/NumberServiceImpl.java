package com.mx.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.bean.NumberBean;
import com.mx.service.NumberService;
import com.mx.model.Number;
import com.mx.repo.NumberRepo;

@Transactional
@Service
public class NumberServiceImpl implements NumberService {

	@Autowired
	private NumberRepo numberRepo;

	Number number = new Number();
	NumberBean numberBean = new NumberBean();

	@Override
	public NumberBean analyze(Integer x) {

		this.numberBean.setEvenNumber(this.isEven(x));
		this.numberBean.setPrimeNumber(this.isPrime(x));
		this.numberBean.setFactorial(this.getFactorial(x));

		this.number.setEvenNumber(this.isEven(x));
		this.number.setPrimeNumber(this.isPrime(x));
		this.number.setFactorial(this.getFactorial(x));

		numberRepo.save(number);	
		return numberBean;
	}

	
	// Function for even
	public String isEven(Integer j) {
		String result;
		if (j % 2 == 0) {
			result = "yes";
		} else {
			result = "no";
		}
		return result;
	}

	
	// Function for prime
	public String isPrime(Integer j) {
		String resul1;
		boolean control = true;
		int num1 = j - 1;
		int i = 0;
		for (i = j - 1; i > 1; i--) {
			if (control == true) {
				if (j % (num1) == 0) {
					control = false;
				}
			}
			num1--;
		}

		if (control == true) {
			resul1 = "yes";
		} else {
			resul1 = "no";
		}
		return resul1;
	}

	
	// Function for factorial
	public Integer getFactorial(Integer j) {
		Integer num = j;
		for (int i = j - 1; i > 0; i--) {
			num = num * (j - 1);
			j--;
		}
		return num;
	}

	
}