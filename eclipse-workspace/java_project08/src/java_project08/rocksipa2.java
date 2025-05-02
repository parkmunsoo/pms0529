package java_project08;
import java.util.Scanner;
public class rocksipa2 {
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name_st_a = sc.nextLine();
		//int name_INTE_a = sc.nextInt();
		//System.out.println();
		
		int win = 0;
	while(win<5) {	
		public static String checkNum(int num){
			Scanner sc = new Scanner(System.in);
			int player = sc.nextInt();
			int computer = (int)(Math.random()*3);
			int Rock = 0;
			int paper = 1;
			int scissors = 2;
			win = win+1;
		}
			public static void main(String[] args) {		
				// TODO Auto-generated method stub
				System.out.println("0을입력하시면 Rock, 1를입력하시면 paper, 2을입력하시면scissors입니다>>");

//				int player = sc.nextInt();
//				int computer = (int)(Math.random()*3);
//				int Rock = 0;
//				int paper = 1;
//				int scissors = 2;
//
//				System.out.println(player);
//				System.out.println(computer);
				if(player == Rock){
					if(computer==scissors) {
						System.out.println("{{플레이어: Rock, computer: scissors}: {결과 : 컴퓨터의패배 <=> 플레이어의승리}}");}
					else if(computer==paper){
						System.out.println("컴퓨터의승리 <=> 플레이어의패배");}
					else {
						System.out.println("무승부");}
					}
				else if(player == paper) {
					if(computer==Rock){ 
						System.out.println("컴퓨터의패배 <=> 플레이어의승리");}
					else if(computer==scissors){  
						System.out.println("컴퓨터의승리 <=> 플레이어의패배");}
					else {
						System.out.println("무승부");}
					}
				else if(player == scissors){
					if(computer==paper){
						System.out.println("컴퓨터의패배 <=> 플레이어의승리");}
					else if(computer==Rock){  
						System.out.println("컴퓨터의승리 <=> 플레이어의패배");}
					else{
						System.out.println("무승부");}
				}	
			}
		}
	}
}
