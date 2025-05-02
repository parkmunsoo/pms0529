package pract;
import java.util.Random;
import java.util.Scanner;
public class pract4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 종료(4)>>");
			int player = sc.nextInt();
			if(player == 4) {
				System.out.println("게임을 종료합니다… ");
				break;
			}
			int computer = (int)(Math.random()*3+1);
			Random r = new Random();
			computer = r.nextInt(3)+1;
			int result = player-computer;
			System.out.println("유저:"  +  player  +  "vs"  +  computer  +  ":컴퓨터");
			if(result == 0) {
				System.out.println("DRAW.");
			}else if(result==-2 || result==1) {
				System.out.println("WIN.");
			}else {
				System.out.println("LOSE.");
			}
		}
	}
}









