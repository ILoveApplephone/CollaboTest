package kr.ac.kopo.day07;

import java.util.Scanner;

public class Home02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ar[]= new int[5];
		
		System.out.println("0-99사이의 정수를 입력");
		int i =0;
		while(i<ar.length) {
			System.out.print("num"+(i+1)+":");
			ar[i]=sc.nextInt();
			if(0<=ar[i]&&99>=ar[i]) {
				i++;
			}
			
		}
		System.out.println("<PRINT>");
		for(i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
		// 여기까지밖에 이해가 외않돼지
	System.out.println();	
		System.out.println("<REVERSE>");
		for(i=0;i < ar.length;i++) {
			System.out.print((ar[i]/10)+((ar[i]%10)*10)+" ");
		}
		}

}
