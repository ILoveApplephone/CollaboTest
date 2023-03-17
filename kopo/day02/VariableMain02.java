package kr.ac.kopo.day02;

public class VariableMain02 {

	public static void main(String[] args) {
		
		double num = 12.34;
		// 형변환 
		num = /*(double)*/34;  // 묵시적 형변환(작은범위를 큰 범위에 넣을때 형변환 생략 가능X)
		System.out.println("num : " + num);
		
		int num2;
		num2 = (int)45.67; // 강제적(명시적) 형변환		
		System.out.println("num2 : " + num2);
		
		float num3;
		num3 = (float)10.4;
		num3 = 10.4f;
		System.out.println("num3 : " + num3);
		
		//작은수 와 큰수와 더하면 자연스레 큰수에 묵시적 형변환
		System.out.println(/*(double)*/12 + 12.34);
		System.out.println(12 + /*(int)*/12.34);
		
		
	}

}
