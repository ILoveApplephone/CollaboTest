package kr.ac.kopo.day01;


/*
 출력메소드 System.out.출력메소드()
print() : 개행문자 X
println() : 개행문자 O
printf() :  
 */

public class PrintMain {

	public static void main(String[] args) {
		// 문자 + 문자(작은따옴표) 숫자
		System.out.println(10+' ');
		// 문자 + 문자(큰따옴표) 
		System.out.println(10 + " ");
		
		System.out.println(10);
		System.out.println(12.34);
		
		// 방법1
		System.out.print('A');
		System.out.print('\n');
		
		// 방법2
		System.out.print("A\n");
		
		// 방법3
		System.out.println('A');
		System.out.println('A');
		
		// 10 12.34 홍길동
		System.out.print(10);
		System.out.print(' ');
		System.out.print(12.34);
		System.out.print(' ');				
		System.out.print("홍길동");
	}
}
