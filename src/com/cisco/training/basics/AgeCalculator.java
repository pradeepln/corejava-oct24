package com.cisco.training.basics;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		Base b;
		
		System.out.println("Enter Your Birthday (yyyy-MM-dd): ");
		
		Scanner kb = new Scanner(System.in);
		String input = kb.nextLine();
		
		LocalDate birthday = LocalDate.parse(input);
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthday, today);
		
		System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days old!");
	}

}
