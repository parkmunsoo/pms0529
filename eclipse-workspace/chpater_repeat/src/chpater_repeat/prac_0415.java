package chpater_repeat;
import java.util.Scanner;

public class prac_0415 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//		int count = 0;
//		for(int i=7; i>0; i-=2) {
//			for(int j=0; j<count; j++) {
//				System.out.print(" ");
//			}
//			count++;
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
			
			int count = 3;
			for(int i=0; i<6; i+=2) {
				for(int j=0; j<count; j++) {
					System.out.print(" ");
				}
				count--;
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			count = 0;
			for(int i=7; i>0; i-=2) {
				for(int j=0; j<count; j++) {
					System.out.print(" ");
				}
				count++;
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
				
				
				
				
				Scanner sc = new Scanner(System.in);
				int win = 0;
				int lose = 0;
				int tie = 0;
				while(win<=5) {
					System.out.println("가위(1), 바위(2), 보(3) 중에 선택해주세요>>");
					int player = sc.nextInt();
					int computer = (int)(Math.random()*3)+1;
					int result = player - computer;
					if(result == 0) {
						System.out.println("플레이어:"+player+"vs"+computer+":컴퓨터 비김");
						tie++;
					}else if(result == -2 || result == 1) {
						System.out.println("플레이어:"+player+"vs"+computer+":컴퓨터 승리");
						win++;
					}else if(result == -1 || result == 2) {
						System.out.println("플레이어:"+player+"vs"+computer+":컴퓨터 패배");
						lose++;
					}
					System.out.println("승리:"+win+"/5 , 패배:"+lose+" , 비김:"+tie);
				}
			}
		}

	}

