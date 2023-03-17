package kr.ac.kopo.day01;

/*
printf : 변환문자를 이용하여 실수 출력
%c : 문자
%d : 10진수 정수
%f : 실수
%s : 문자열
%d : 논리값

*/
public class PrintMain02 {


	public static void main(String[] args) {

		System.out.printf("4 > 2 : %b\n", 4 > 2);
				
		System.out.printf("%d %f %s\n", 10, 12.34, "홍길동");
		
		// 자릿수에 맞춤
		System.out.printf("[%5d] %f %s\n", 123, 12.34, "홍길동");
		System.out.printf("[%05d] %f %s\n", 123, 12.34, "홍길동");
		System.out.printf("[%5d] %f %s\n", 12345678, 12.34, "홍길동");
		
		// 소수점 자릿수 반올림
		System.out.printf("%d %.2f %s\n", 10, 12.34, "홍길동");
		
		// -0.05 소수점 절삭
		System.out.printf("%d %.1f%s\n", 10, 12.34-0.05, "홍길동");
		
	}

}
