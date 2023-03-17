package kr.ac.kopo.day06.exam;

public class Homework08 {

	public static void main(String[] args) {
// 구구단을 한라인에 3줄씩
		for (int st = 2; st < 10; st += 3) {
			for (int i = 1; i < 10; ++i) {
				for (int j = st; j < (st + 3 < 10 ? st + 3 : 10); ++j) {
					System.out.print(j + " * " + i + " = " + i * j + "   ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}