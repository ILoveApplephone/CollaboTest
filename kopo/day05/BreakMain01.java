package kr.ac.kopo.day05;

public class BreakMain01 {

	public static void main(String[] args) {
		// 반복문을 다 안해도 빠져나올 수 있음
		
		for(int cnt = 1; cnt <= 10; cnt ++) {
		if(cnt == 3) {
			break; // continue;
		}
		// continue 사이클을 돌지만 반복문을 수행하지 않는다. 	
			System.out.println("Hi");
		}
		
	}

}
