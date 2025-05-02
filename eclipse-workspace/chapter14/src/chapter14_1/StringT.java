package chapter14_1;
import java.util.StringTokenizer;
import java.util.Arrays;

public class StringT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st1 = new StringTokenizer("a b c");
		
		//hasMoreTokens():다음 글자 존재성검토[T,F]
		while(st1.hasMoreTokens()) {
			//nextToken(): 다음 문자를 출력
			//split은 구분자를 저장하는 기능이없음
			System.out.println(st1.nextToken());
			//stringTo
			String str = "010-1234-5678";
			String[] parts = str.split("-");
			System.out.println(Arrays.toString(parts));
			for(int i=0; i<parts.length; i++) {
				System.out.println(parts[i]);
			}
		}
	}
}

