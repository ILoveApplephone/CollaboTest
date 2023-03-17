package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 *1-3 사이의 정수 입력
 *
 *1입력 => one
 *2입력 => two
 *3입력 = > three
 *그외 입력 => error
 */
public class SwitchMain01 {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("1 - 3사이의 정수: ");
		
		int no = sc.nextInt();
		
		switch(no) {
		case 1 :
			System.out.println("one");
			break;
		case 2 :
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break;
		default :
			System.out.println("error");
				
		}
		
//		if(no ==1) {
//			System.out.println("one");
//		} else if (no == 2) {
//			System.out.println("two");
//		}else if (no == 3) {
//			System.out.println("three");
//		}else {
//			System.out.println("error");
//		}
	}

}
