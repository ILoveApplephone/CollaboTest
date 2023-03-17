package kr.ac.kopo.day05;

public class LoopMain01 {
	public static void main(String[] args) {
		
		
		int cnt = 1;
		while(cnt <= 5) {
			System.out.println("Hello");
			++cnt;
		}
		System.out.println("cnt : "+ cnt);
		
		// 두번째는 선언이 안되기 때문에, 초기화만 해야됨
		
		cnt = 1;
		while(cnt <= 3) {
			System.out.println("bye");
			++cnt;
		}
		System.out.println("cnt " + cnt);
		
		}

}
