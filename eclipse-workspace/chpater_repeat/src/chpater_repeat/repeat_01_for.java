package chpater_repeat;

public class repeat_01_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기값; 조건식; 증감식){
		//							}
		//for(first, last , intaval_length) 
		//}
		int total = 0;
		for(int i = 0; i<=10; i++) {
				System.out.println(i+"번째 실행");
				total = total +i;}
		System.out.println(total+"최종결과");
	}
}