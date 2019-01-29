package Labbook_mod1.lab2;

import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("First name-");
		String s=sc.next();
		System.out.println("Last name-");
		String l=sc.next();
		System.out.println("gender-");
		char c=sc.next().charAt(0);
		System.out.println("age-");
		int n=sc.nextInt();
		System.out.println("weight-");
		double w=sc.nextFloat();
		System.out.println("Personal Details:");
		System.out.println("_________________");
		System.out.println("First Name:"+s);
		System.out.println("Last Name:"+l);
		System.out.println("Gender:"+c);
		System.out.println("Age:"+n);
        System.out.println("Weight:"+w);		

	}

}
