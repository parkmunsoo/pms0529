package pract;
import java.util.Arrays;

public class StringPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0.주어진것 S	, S[n]을 S에대한 n-1의위치라고하면..
		//1. S의길이를 Sl이라할때
		//2. S1[0]은 s1의시작점 , s1자체로 종료위치를알수있다
		//3. 주어진문자열이공개됐다 [0]이처음문자열 [5]구해야할문자열중에서는마지막위치이다
		String str = "0101311-2468102";
		String year = str.substring(0, 2);
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);
		int yeari = Integer.parseInt(year);
		if(yeari>50) {
			yeari = yeari+1900;
		}
		else{
			yeari = yeari+2000;
		}
	//if str[0],str[1]가 25보다 크며 250417(오늘날짜)이상인경우에는 1900을더하며 ,아니라면 2000을더한다 
		


		System.out.println(yeari+"년"+month+"월"+day+"일 이 생일입니다.");
//		String
	}

}
