package kr.ac.kopo.day05.homework;

public class Homework16 {

	public static void main(String[] args) {
		/*
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */

		int k = 0;
		for(int i =1; i<=9;i++) {
			
			for(int j=1;j<=9;j++) {
				if(j<=k || j >=10-k) {
					System.out.print("-");
				}else {
					System.out.print("*");
				}
				
		}
			System.out.println();
		if(i<5) {
			k++;
		}else {
			k--;
		}
		
//		for (int i=1;i>=9;i++) {
//			if(i <=5) {
//				for(int j=1; j<=i-1;j++) {
//					System.out.print("-");
//				}
//				for(int j=1; j<= 2*(6-i)-1;j++) {
//					System.out.print("*");
//				}
//			}else {
//			for(int j=1; j<=9-i;j++) {
//				System.out.print("-");
//			}
//			}
			
		}
	}

}
