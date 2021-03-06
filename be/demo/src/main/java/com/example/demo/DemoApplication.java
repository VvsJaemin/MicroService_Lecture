package com.example.demo;

import static com.example.demo.cmm.util.Proxy.rangeBelowRandom;
import static com.example.demo.cmm.util.Proxy.rangeRandom;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String... args) {
		SpringApplication.run(DemoApplication.class, args);

		int year = rangeBelowRandom.apply(1970, 2000);
		int month = rangeBelowRandom.apply(1, 12);
		int date28 = rangeBelowRandom.apply(1, 28);
		int date29 = rangeBelowRandom.apply(1, 29);
		int date30 = rangeBelowRandom.apply(1, 30);
		int date31 = rangeBelowRandom.apply(1, 31);
		int date = 0;
		
		boolean leapYear = ((year % 4==0 && year % 100 !=0) || year % 400==0);
		
		switch(month) {
		case 4: case 6: case 9: case 11:
			date = date30; break;
		case 2:
			date = ((year % 4==0 && year % 100 !=0) || year % 400==0) ? date29 : date28;
			break;
		default: 
			date = date31;
		}
		
		System.out.println(year+"-"+month+"-"+date);
	}
}
