package prac;
import java.util.Scanner;
import java.util.InputMismatchException;
public class RCP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("0을입력하시면 Rock, 1를입력하시면 paper, 2을입력하시면scissors입니다>>");
		int player = 0;
		try {
			player = sc.nextInt();
		} catch (ArithmeticException | InputMismatchException e) {
				System.out.println("문자열이 입력되었습니다. 오류발생");
				return;
		}
		int computer = (int) (Math.random() * 3);
		int Rock = 0;
		int paper = 1;
		int scissors = 2;
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
