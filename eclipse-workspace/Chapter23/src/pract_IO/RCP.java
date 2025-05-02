package pract_IO;
import java.util.Scanner;

public class RCP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Player 1의 선택 (가위, 바위, 보): ");
        String pl1 = scanner.nextLine().toUpperCase();
        System.out.print("Player 2의 선택 (가위, 바위, 보): ");
        String pl2 = scanner.nextLine().toUpperCase();

        String R = "바위";
        String P = "보";
        String S = "가위";

        if (pl1.equals(R) && pl2.equals(S)) {
        	String A = "바위 vs 가위 → 바위의 승리!!";
            System.out.println(A);
            writer.write(A);

        } else if (pl1.equals(R) && pl2.equals(P)) {
            System.out.println("바위 vs 보 → 보의 승리!!");
            writer.write("작성완료" + "\n");

        } else if (pl1.equals(S) && pl2.equals(P)) {
            System.out.println("가위 vs 보 → 가위의 승리!!");
        } else if (pl1.equals(P) && pl2.equals(R)) {
            System.out.println("보 vs 바위 → 보의 승리!!");
        } else if (pl1.equals(P) && pl2.equals(S)) {
            System.out.println("보 vs 가위 → 가위의 승리!!");
        } else if (pl1.equals(S) && pl2.equals(R)) {
            System.out.println("가위 vs 바위 → 바위의 승리!!");
        } else if (pl1.equals(pl2)) {
            System.out.println("무승부!!");
        } else {
            System.out.println("'가위', '바위', '보' 중 하나를 입력하세요.");
        }

        scanner.close();
    }
}