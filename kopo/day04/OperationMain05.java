package kr.ac.kopo.day04;

/*
  두개 정수 입력 : 12 5 
  12는 5의 배수 판단: 배수가 아닙니다
  
  두 개의 정수 입력 : 12 6
  12는 6의 배수판단 : 배수입니다
 */

public class OperationMain05 {
	public static void main(String[] args) {
				
		// String msg = true ? "배수다" : "배수아님";
		// System.out.println(10 > 4 ? "배수다" : "배수가 아니다");
		
		int num01 = 15, num02 = 3;
		
		boolean bool = (num02 != 0 && num01 % num02 == 0);
		
		String result = bool ? "배수입니다" : "배수가 아닙니다";
		
		System.out.printf("%d는 %d의 배수판단 : %s\n", num01, num02, result);
		
		
		
		
		
		
	}

}
