package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.service.AdditionService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class AdditionController {

	@Autowired
    private AdditionService service;
	
	@RequestMapping("/addition")
	public int addNumbers(@RequestParam("firstNumber") int fNo, @RequestParam("secondNumber") int sNo) {
		return service.performAddition(fNo, sNo);
	}
}