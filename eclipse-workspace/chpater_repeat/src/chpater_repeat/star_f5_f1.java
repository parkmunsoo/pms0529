package chpater_repeat;

public class star_f5_f1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
//	   int a = 1;
//		
//		for(int b = 0; b<4; b++) {
//			System.out.println(a);
//			System.out.println(b+a+b);
//			for(int c=0; b==c; b--){
//				System.out.print("*");
//			}
//		}
//		
		
		//a는고정
		//b는증가

//			String a_star = "*";
//			String b_stars = "";
//			String blank = " ";
//
//			for(int b = 0; b<4; b++) {
//				String stars = b_stars + a_star + b_stars;
//				System.out.print(blankstars);
//				b_stars = b_stars+a_star;
//				System.out.println();
//			}
		


			
//			
//			String star = "*";
//			String stars = " ";
//			String blank = " ";
//			String all = "";
//			int max = 4;
//
//			for(int i = 0; i<4; i++) {
//				System.out.println();

//				
//				for
//			}

//			String b2_stars = "***";
//			for(int b = 0; b<4; b++) {
//				System.out.print(b2_stars + a_star + b2_stars);
//				b2_stars = b2_stars - a_star;
//				System.out.print(line_feed);
//					}
//			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		 5. 
//		 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요
		//														
//			 *					blank:3 - star:0 , star_a:1 , blank:3- star:0 //blank + star + star_a +star + blank
//		 	***					blank:3 - star:1 , star_a:1 , blank:3 -star:1// blank + star + star_a +star + blank
//		   *****				blank:3 - star:2 , star_a:1 , blank:3 -star:2//blank + star + star_a +star + blank
//		  *******				blank:3 - star:3 , star_a:1 , blank:3 -star:3//blank + star + star_a +star + blank
								//        star는1씩증가 ,star_a는고정
								//	star의개수만큼 blank를빼고  (blank + star + star_a +star + blank)를출력


		String b = " ";
		String bs = "";
		String s = "*";
		String ss = "";
		int num = 0;
		
		
		
		while(num<3){
			for(int j=num; j==num; j--) {
				bs = bs + b;
			}
			for(int i = 0; i!=num; i++) {
				ss = ss+s;
			}
			num = num+1 ; 
			System.out.println(bs+ss+s+ss+bs);

			}
	}

}
