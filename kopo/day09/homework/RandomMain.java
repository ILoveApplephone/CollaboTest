package kr.ac.kopo.day09.homework;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		// 임의의 정수를 추출
			Random r = new Random();
				
			int random = r.nextInt(10);
			System.out.println(random);
	}

}
