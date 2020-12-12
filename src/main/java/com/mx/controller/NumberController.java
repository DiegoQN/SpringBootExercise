package com.mx.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mx.bean.NumberBean;
import com.mx.service.NumberService;

@RequestMapping("/operation")
@RestController
public class NumberController {

	@Autowired
	private NumberService numberService;
	
	@GetMapping("analyze/{num}")
	public ResponseEntity<NumberBean>analyze(@PathVariable("num")Integer num){
		return new ResponseEntity<>(numberService.analyze(num), HttpStatus.OK);
	}
}