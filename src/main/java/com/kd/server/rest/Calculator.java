package com.kd.server.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class Calculator {

	@GetMapping("{op1}/{op2}")
	public int calculate(@PathVariable int op1, @PathVariable int op2) {

		return op1 + op2;
	}

}
