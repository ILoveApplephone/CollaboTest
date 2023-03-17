package kr.ac.kopo.day03;

public class OperationMain01 {
	
	public static void main(String[] args) {
	int num = 123;
	
	// (= 대입) 연산자가 있어야 변수가 바뀜 / ++만 유일하게 자신의 변수가 바뀜
	// num = num + 1;
	
	num += 1; // 복합 대입연산자, 배정연산자
	
	// 차이
	num++; // 후위 증가
	++num; // 전위 증가
		
	System.out.println("num: " + num);
	
	int a= 10;
	System.out.println(a++); // 10 출력 후 +1
	System.out.println(++a); // +1 후 출력
	
	
	}

}
