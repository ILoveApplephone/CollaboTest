package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작단을 입력 : ");
		int num = sc.nextInt();
		System.out.print("종료단을 입력 : ");
		int num1 = sc.nextInt();

		int st = num <= num1 ? num : num1;
		int ed = num <= num1 ? num1 : num;

		for (int i = st; i < ed + 1; i++) {
			System.out.println("***" + i + "단***");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);

			}
		}

	}

}
