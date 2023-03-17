package kr.ac.kopo.day06.exam;



public class Homework04 {

	public static void main(String[] args) {
	// 달팽이 우물 오르는것 출력
			int snail = 0;
			int timeCnt = 0;
			while (snail <= 100) {
				snail += 5;
				if (snail < 50) {
					snail -= 1;
				} else {
					snail -= 2;
				}
				++timeCnt;
				System.out.println("[" + timeCnt + " 시간후] 달팽이가 올라간 총 높이 : " + snail + "m");
	
				
			}
		}
	}
		
		

	


