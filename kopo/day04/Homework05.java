package kr.ac.kopo.day04;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책 권수: ");
		int book = sc.nextInt();
		
		switch(book) {
		case 0 :
			System.out.println("보유하고 있는 책이 없습니다.");
			break;
		case 1 :
			System.out.println("1 book");
			break;
		default :
			if(book>1) {
				System.out.printf("%d books\n",book);
			}else {
				System.out.println("잘못입력했습니다.");
						

		
}
	}
		}}



