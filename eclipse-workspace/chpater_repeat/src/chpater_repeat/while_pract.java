package chpater_repeat;

public class while_pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 
		//구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요
		
		for(int i = 2 ; i<9; i=i+2){
			for(int ii = 1; ii<=9; ii++) {
				System.out.println(i+"*"+ii+"="+(i*ii));
				if ((i==8)&&( ii ==9)) {
				System.out.println("종료하였습니다");
				 continue;}}}
//
		//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램
		//을 만들어 보세요
	//	. 
		for(int i = 1 ; i<=9; i=i+1){
			for(int ii = 1; ii<=i; ii++) {
				System.out.println(i+"*"+ii+"="+(i*ii));
				}
		}
		
		for(int k= 1; k<=5; k=k+1){
			String kkk = "";
			 for(int kk = 1; kk<=k; kk = kk+1){
				 kkk = kkk+"*";	
			}
			 System.out.println(kkk);
		}
		
		for(int i= 5; i>=1; i=i-1){
			String k = "";
			 for(int j = 1; j<=i; j = j-1){
				 k = k+"*";	
			}
			 System.out.println(k);
		}
		
		
		
		
		
	}

}
