package kr.ac.kopo.day05;

public class Loopmain02 {
	

		public static void main(String[] args) {
		for(int cnt = 1;cnt <= 5;++cnt) {
			System.out.println("Hello");
		}
		
		// for문안에 변수는 살아있지 않아 또 선언 할 수 있음
		
		for(int cnt =1; cnt <= 3 ; cnt++) {
			System.out.println("Good-bye");
		}
	}

}
