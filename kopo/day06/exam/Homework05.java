package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 단을 입력받아 구구단 실행
		System.out.print("단을 입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i <= 9; i++)

			System.out.println(num + "*" + i + "=" + num * i);

	}

}
