package kr.ac.kopo.day03;

/*
  두개 정수 입력 : 12 5 
  12는 5의 배수 판단: false
  
  두 개의 정수 입력 : 12 6
  12는 6의 배수판단 : true
 */

public class OperationMain03 {
	public static void main(String[] args) {
		 // 한번 초기화가 되면 콤마 뒤에 초기화가 된다..
		
		int num01 = 15, num02 = 0;
		
		boolean bool = (num02 != 0 && num01 % num02 == 0);
		
		System.out.printf("%d는 %d의 배수판단 : %b\n", num01, num02, bool);
		
		// 혼자 실습
		int random1 = 20, random2 = 0;
		boolean ibk = (random2 != 0 && random1 % random2 == 0);
		//boolean ibk = random1 % random2 == 0;
		System.out.printf("%d는 %d의 배수 판단: %b\n", random1, random2, ibk);
		
		
		
	}

}
