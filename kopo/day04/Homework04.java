package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("첫번째 정수 : "); 
	int num01 = sc.nextInt();
	
	System.out.print("두번째 정수 : ");
	int num02 = sc.nextInt();
	
	System.out.print("세번째 정수 : ");
	int num03 = sc.nextInt();
	
	System.out.print("네번째 정수 : ");
	int num04 = sc.nextInt();
	
	int max = num01;
	if(num02>max) max = num02;
	if(num03>max) max = num03;
	if(num04>max) max = num04;
	
	System.out.println("가장 큰 수는 " + max);
}
	
}

