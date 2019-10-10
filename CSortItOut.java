package com.bubblesort;

import java.util.Scanner;

public class CSortItOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		class Number{
			int a;
			int b;
		}
		Number[] num=new Number[n];
		for(int i=0;i<n;i++) {
			//Number x=new Number();
			//x.a=sc.nextInt();
			//x.b=i;
			//num[i]=x;
			a[i]=sc.nextInt();
			b[i]=i;
		}
		for(int i=0;i<n;i++) {
			int tempsort=0;
			for(int j=n-1;j>0;j--) {
				if(a[j-1]>a[j]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					temp=b[j];
					b[j]=b[j-1];
					b[j-1]=temp;
					tempsort=j;
				}/*
				if(num[j-1].a>num[j].a) {
					Number temp=num[j];
					num[j]=num[j-1];
					num[j-1]=temp;
					//temp=b[j];
					//b[j]=b[j-1];
					//b[j-1]=temp;
				}*/
			}
			//System.out.println(b[i]+" ");
			//System.out.print(num[i].b+" ");
			System.out.println(tempsort+" ");
		}
	}

}
