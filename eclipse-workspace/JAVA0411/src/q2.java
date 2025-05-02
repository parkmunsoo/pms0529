import java.util.Scanner;
//String name_st_a = sc.nextLine();
//int name_INTE_a = sc.nextInt();
//System.out.println();

public class q2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//										[0,1,2]의가지수 3개
		// System.out.println("가위,바위,보 중에 입력해주세요 >>");

		// {가위바위보:{0,1,2}}: {Rock:0 , paper:1 , scissors:2}

		System.out.println("0을입력하시면 Rock, 1를입력하시면 paper, 2을입력하시면scissors입니다>>");

		int player = sc.nextInt();
		int computer = (int) (Math.random() * 3);
		int Rock = 0;
		int paper = 1;
		int scissors = 2;
		// ROCK일때진입 // paper일때진입 // scissors일때진입
		// n이 n+2를이기며 n+1에게짐 // m이 m-1을이기며 m+1에게짐 // l이 l-1을이기며 l-2에게짐
		// {Rock : n , paper : m , scissors : l}

		System.out.println(player);
		System.out.println(computer);
		if (player == Rock) {
			if (computer == scissors) {
				System.out.println("{{플레이어: Rock, computer: scissors}: {결과 : 컴퓨터의패배 <=> 플레이어의승리}}");
			} else if (computer == paper) {
				System.out.println("컴퓨터의승리 <=> 플레이어의패배");
			} else {
				System.out.println("무승부");
			}
		} else if (player == paper) {
			if (computer == Rock) {
				System.out.println("컴퓨터의패배 <=> 플레이어의승리");
			} else if (computer == scissors) {
				System.out.println("컴퓨터의승리 <=> 플레이어의패배");
			} else {
				System.out.println("무승부");
			}
		} else if (player == scissors) {
			if (computer == paper) {
				System.out.println("컴퓨터의패배 <=> 플레이어의승리");
			} else if (computer == Rock) {
				System.out.println("컴퓨터의승리 <=> 플레이어의패배");
			} else {
				System.out.println("무승부");
			}
		}
	}
}
