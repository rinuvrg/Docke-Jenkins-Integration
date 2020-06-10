package com.training.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController 
{
	@RequestMapping("/welcome")
	public String welcome()
	{
		System.out.println("API HIT : "+Calendar.getInstance().getTime());
		return "@@@@----------------Welcome API---------------------@@@@@";
	}
}
