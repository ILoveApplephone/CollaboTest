package kr.ac.kopo.day08.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		int[][] PrimeArr = new int[10][20];

		System.out.println("10개의 정수를 입력, 0이면 종료");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] == 0) {
				break;
			} else {
				for (int j = 1, k = 0; j <= ar[i]; j++) {
					if (ar[i] % j == 0) {
						PrimeArr[i][k] = j;
						k++;
					}
				}
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(ar));

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				System.out.print(ar[i] + "의 약수: ");
				for (int j = 0; j < PrimeArr[0].length; j++) {
					if (PrimeArr[i][j] > 0) {
						System.out.print(PrimeArr[i][j] + " ");
					}
				}
				System.out.println();
			}

		}
	}
}
