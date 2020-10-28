package com.example.restservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PredictionController {

	@PostMapping("/ml-probability-of-default")
	public Prediction mlProbabilityOfDefault(@RequestBody LoanApplication loanData) {
		System.out.println("mlProbabilityOfDefault");
		return new Prediction(loanData);
	}
}
