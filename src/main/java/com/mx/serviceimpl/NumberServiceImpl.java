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
public class NumberServiceImpl implements NumberService{

	@Autowired
	private NumberRepo numberRepo;
	
	
	@Override
	public NumberBean analyze(Integer x) {
		
		
		Number number = new Number();
		NumberBean numberBean = new NumberBean();
		
		
		//Function for factorial
		int num = x;
		for(int i=x-1; i>0; i--) {
			num = num * (x-1);
			x--;
		}
		numberBean.setFactorial(num);
		number.setFactorial(num);
		
		
		//Function for prime
		boolean control = true;						
			int num1 = x-1;
			for(int i=x-1; i>1; i--) {
				if(control==true) {
					if(x%(num1)!=0) {
						control = false;
					}
				}
				num1--;
			}
		
		if(control==true) {
			numberBean.setPrimeNumber("yes");
			number.setPrimeNumber("yes");
		}
		else {
			numberBean.setPrimeNumber("no");
			number.setPrimeNumber("no");
		}
		
		
		//Function for even
		if (x%2==0) {
			number.setEvenNumber("yes");
			numberBean.setEvenNumber("yes");
		}
		else {
			number.setEvenNumber("no");
			numberBean.setEvenNumber("no");
		}
		
		
		numberRepo.save(number);
		return numberBean;
	}

}