import java.util.Scanner;
//Scanner sc = new Scanner(System.in);
//	System.out.println("");}
//String name_st_a = sc.nextLine();
//int name_INTE_a = sc.nextInt();

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		//___________________________BOUNDARY(first_practice)_______________________//
		System.out.println("처음수를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("두번째수를 입력해주세요");
		int num2 = sc.nextInt();		
		int a_add_b = num1 + num2;
		System.out.println(num1+"더하기"+num2+"의결과는"+a_add_b+"입니다");
		
		
		
		
		//___________________________BOUNDARY(second_practice)_______________________//
		System.out.println("임의의 A라는 건물의층에 해당하는 층수를 임력하세요");
		int FLO_HE = sc.nextInt() *5;
		System.out.println(FLO_HE/5+"층의"+"높이는"+FLO_HE+"m 입니다");

		
		
		
		
		//___________________________BOUNDARY(third_practice)_______________________//

		System.out.println("x를입력하세요");
		int x = sc.nextInt();
		int a = x;
		int y = a*a  +7 +(-3*a);
		System.out.println("주어진x에대한값이"+a+"일때 그에대한 결과는" + y + "로 나타난다");

		
		//___________________________BOUNDARY(fourth_practice)_______________________//

		
		
		
	//	System.out.println("처음인자를 입력하세요");
	//	boolean Ba = sc.nextBoolean(); 
//		연산자
	//	String op = sc.next();   
	//	System.out.println("두번째인자를 입력하세요");
	//	boolean Bb = sc.nextBoolean();
	//	switch(op) { 
	//	case "AND": 
	//		boolean Bab = Ba&&Bb;
	//		System.out.println(Bab);
	//		break;
	//	case "OR": 
//			boolean Bab1 = Ba||Bb;
	//		System.out.println(Bab1);
//			break;
//		}  

		
		int F0000 = 0;
		int O0000 = 0;
		int Money = sc.nextInt();
		int MN50000 = 0;
		int MN10000 = 0;
		int MN1000 = 0;
		if(Money>50000){
			MN50000 = Money/50000;
			Money = Money-(50000*MN50000);
		}
		if(Money<50000){
			MN10000 = Money/10000;
			Money = Money-(10000*MN10000);
		}
		if(Money<10000) {
			MN1000 = Money/1000;
			Money = Money-(1000*MN1000);
		}

		System.out.println("오만원권의개수는"+MN50000 +"개"+"일만원권의개수는" + MN10000+"개" + "일천원권의개수는"
										+MN1000	+"개"	);



	}

}
