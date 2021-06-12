package com.example.demo;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int m = sc.nextInt();
		 int n = sc.nextInt();
		 int max = 0;
		 
		 int a[] = {6,7,8,9,3,4,5,6};
		 
		 for(int i=0;i<a.length-n+1;i++) {
			 int sum = 0;
			 for(int j=i;j<i+n;j++) {
				 System.out.println(a[j]);
				 sum = sum + a[j];
			 }
			 System.out.println("Sum :"+" "+i+ " " +sum);
			 System.out.println("----------------------------");
			 if(sum>max) {
				 max = sum; 
			 }
		 }
		 
		 System.out.println("Max :"+max);
		
	}
	
}

