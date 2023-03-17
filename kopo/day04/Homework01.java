package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		double r = sc.nextDouble();
		
		double PI = 3.141592;
		double A = r*r*PI;
		double B = 2*r*PI;
		
		System.out.printf("원의 넓이 : %.4f\n",A);
		System.out.printf("원의 둘레 : %.4f",B);
		
		
	}
}
