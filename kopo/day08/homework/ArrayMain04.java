package kr.ac.kopo.day08.homework;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		int loc = 0;
		// "하이테크" "자바" "교육"
		//String[] strArr= {"하이테크","자바","교육"};
		String[] strArr= new String[5];
		strArr[loc++] = "하이테크";
		strArr[loc++] = "인공지능소프트웨어";
		strArr[loc++] = "자바";
		strArr[loc++] = "교육";
		
		System.out.println("<index를 이용한 출력>");
		for(int i=0; i< strArr.length;i++) {
			System.out.println(strArr[i]);
		}
				
		System.out.println("<1.5버전 for 출력>");
		for(String str:strArr) {
			System.out.println(str);
		}
		System.out.println("< Arrays.toString( )이용 출력>");
		System.out.println(Arrays.toString(strArr));
		
		
		
		 
		
		
		
	}

}
