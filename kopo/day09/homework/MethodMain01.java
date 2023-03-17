package kr.ac.kopo.day09.homework;

public class MethodMain01 {
	
	
	static int prnStar(int num, String data) {
	
	System.out.println("*****");
	System.out.println("호출자가 넘겨준 정수 : " + num);
	System.out.println("호출자가 넘겨준 문자열 : " + data);
	int sum = num%10 + num/10;
	
	return sum;
}
	public static void main(String[] args) {
		
		int cnt = 10; // 여기서 찍은거는 위에서 원래는 안 찍힘, 서로 독립적이라
		int s= prnStar(cnt,"abc");
		System.out.println("자릿수 합: " +s);
		System.out.println("Hello");
		
		s= prnStar(13,"bcd");
		System.out.println("자릿수 합: " +s);
		System.out.println("Hello");
		
		s= prnStar(21,"bawdg");
		System.out.println("Hi");
		System.out.println("자릿수 합: " +s);
	
		s= prnStar(25,"sda");
		System.out.println("Good");		
		System.out.println("자릿수 합: " +s);
		
		
		
		
		
		
	}

}
