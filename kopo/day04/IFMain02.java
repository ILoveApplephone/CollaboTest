package kr.ac.kopo.day04;

import java.util.Scanner;

public class IFMain02 {
	
	/*
	 보유하고 있는 책 권수 입력 : 3
	 3 books
	 
	 보유하고 있는 책 권수 입력 : 1
	 1 books
	 
	 보유하고 있는 책 권수 입력 : 0
	 보유하고 있는 책 없음
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		
		if(book == 0) {
		System.out.println("보유하고 있는 책 없음");
		} else {
			
			if(book == 1) {
				System.out.println(book + " book");
		} else {
					System.out.println(book + " books");
			}
		}
	}
}
