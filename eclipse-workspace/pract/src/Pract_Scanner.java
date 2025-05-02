import java.util.StringTokenizer;
import java.util.Scanner;

public class Pract_Scanner {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	String str = sc.toString();

        StringTokenizer st = new StringTokenizer(str);
        int Count = st.countTokens(); 
        
        int blank_c = 1;
        for (int i = 0; i < str.length(); i++) {
            if (Count[i] == ' ') {
                blank_c = blank_c +1; 
            }
            System.out.println(blank_c);
        }
	}
}




/*2. Scanner를 이용하여 한 라인을 읽고, 공백으로 분리된 어절이 몇 개인지 출력을 반복하는 
프로그램을 작성하라. “exit”이 입력되면 종료한다. [목적 StringTokenizer 활용] [난이도 하] ----------------------------------------------------------------------------------- 
I Love Java 
어절 개수는 3 

공백개수 +1개


나는 자바 프로그래밍을 정말 좋아합니다. 
어절 개수는 5 
exit 
종료합니다… */