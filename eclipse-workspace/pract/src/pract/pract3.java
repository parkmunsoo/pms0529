package pract;

import java.util.Scanner;
import java.util.StringTokenizer;

public class pract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 다음과 같이 +로 연결된 덧셈식을 입력받아 덧셈 결과를 출력하는 프로그램을 작
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str,"+");
		int sum = 0;
		while(st.hasMoreTokens()) {
			String numStr = st.nextToken().trim();
			int num = Integer.parseInt(numStr);
			sum += num;
		}
		System.out.println("합은 "+sum);
		
	}

}












