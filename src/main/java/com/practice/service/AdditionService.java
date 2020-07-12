package com.practice.service;

import org.springframework.stereotype.Component;

@Component
public class AdditionService {
	public int performAddition(int fNo, int sNo) {
		int total = fNo + sNo;
		return total;
	}
}