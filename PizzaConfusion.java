package com.bubblesort;

import java.util.Scanner;

public class PizzaConfusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] scores=new int[n];
		String[] restuarantNames=new String[n];
		for(int i=0;i<n;i++) {
			restuarantNames[i]=sc.next();
			scores[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			if(scores[i]>scores[i+1]) {
				int temp=scores[i];
				scores[i]=scores[i+1];
				scores[i+1]=temp;
				String temp1=restuarantNames[i];
				restuarantNames[i]=restuarantNames[i+1];
				restuarantNames[i+1]=temp1;
			}
			else if(scores[i]==scores[i+1]) {
				if(restuarantNames[i].compareTo(restuarantNames[i+1])<0) {
					String temp1=restuarantNames[i];
					restuarantNames[i]=restuarantNames[i+1];
					restuarantNames[i+1]=temp1;
				}
			}
		}
		System.out.println(restuarantNames[n-1]);
	}

}
