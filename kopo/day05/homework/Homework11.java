package kr.ac.kopo.day05.homework;

public class Homework11 {

	public static void main(String[] args) {
	/*
	
	 *****
	 ****
	 ***
	 **
	 *
	 **
	 ***
	 ****
	 *****
	
	 */
		for (int i = 1; i <= 9 ; i++) {
			if (i <= 5) {
				for (int j = 5; j >= i; j--) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; i > j+4 ; ++j) {
					System.out.print("*");
				}
			}

			System.out.println();
		}

	}
}
