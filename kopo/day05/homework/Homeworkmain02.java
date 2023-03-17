package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class Homeworkmain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("정수를 4개 입력 : ");
		 //방법 1
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
//		
//		int max01 = num > num2 ? num : num2;
//		int max02 = num3;
//		if(num3 < num4) {
//			max02 = num4;
//		}
//		System.out.println("가장 큰 수 : " + (max01 > max02 ? max01 : max02));
		 
		 
		 //방법 2
		 int max = num > num2 ? num : num2 ;
		 if(max < num3) {
			 max = num3;
		 }
		 if(max < num4) {
			 max = num4;
		 }
		 System.out.println("가장 큰 수: " + max);
		 }
	}


