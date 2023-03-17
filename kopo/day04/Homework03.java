package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("첫번째 정수 : "); 
	int num01 = sc.nextInt();
	System.out.print("두번째 정수 : ");
	int num02 = sc.nextInt();
	System.out.print("세번째 정수 : ");
	int num03 = sc.nextInt();
	
	
	if(num01 >= num02 && num01 >= num03) {
		if(num02>=num03) {
			System.out.println(num01+" "+num02 +" "+num03);
		}
		else {
			System.out.println(num01+" "+ num03+" "+num02);
		}
	}
	
	else if (num01<= num02 && num02 <= num03) {
		if(num02>=num03) {
			System.out.println(num02+" "+ num03+" "+num02);
		}
		else { 
			System.out.println(num03+" "+num02+" "+num01);
		}
	}
	else {
		if(num02>=num03) {
			System.out.println(num02+" "+num01+" "+num03);
		}
		else { 
			System.out.println(num03+" "+num01+" "+num02 );
			}
		}
	}
}
		
	
		
	

	


