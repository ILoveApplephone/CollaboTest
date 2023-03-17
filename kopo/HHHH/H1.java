package kr.ac.kopo.HHHH;

public class H1 {
public static void main(String[] args) {
	int snail = 0;
	int time = 0;
	
	while(snail <= 100) {
		snail +=5;
		if(snail<50) {
			snail--;
		}
		else {
			snail-=2;
		}
		++time;
	System.out.println("["+time+"시간후] 달팽이가 올라간 총 높이 : "+ snail+"M");
	}
}
}
