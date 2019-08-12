package com.test;

import java.util.Scanner;
import java.util.TreeSet;

public class Test1 {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int noOfCust = sc.nextInt();
		 String[] customers;;
		TreeSet<String> customerUnique = new TreeSet<String>();
		for (int i = 0; i < noOfCust; i++) {
			 //customers[i]= sc.next();
			customerUnique.add(sc.next());
		}
		
		System.out.println(customerUnique.size());
		customerUnique.forEach(obj -> {
			System.out.println(obj);
		});
	}
}
