package chapter7;

public class googoodan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 
		//구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요
		
		for(int i = 2 ; i<9; i=i+2){
			for(int ii = 1; ii<=9; ii++) {
				System.out.println(i+"*"+ii+"="+(i*ii));
				if ((i==8)&&( ii ==9)) {
				System.out.println("종료하였습니다");
				 continue;}}}
}
}
//