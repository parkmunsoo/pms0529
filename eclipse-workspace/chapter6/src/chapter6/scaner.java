package chapter6;
import java.util.Scanner;

public class scaner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// println : 문자열 출력과 출력에대한 줄바꿈제공 ㅣㅣ ln is line feed
		
		//System.out.println("출력하고싶은문자열");
		//System.out.println("출력하고싶은문자열");
		
		//System.out.print("안녕하세요 오늘은 4월 10일 입니다");
		//System.out.print("안녕하세요 오늘은 4월 10일 입니다");
		// nextInt() : 
		
		String name = "홍길동"; //"의 나이는" 
		int age = 20; 			//"이고, 키는" 
		double height = 175.5;	//"입니다"
		
		//println // 더하기 연산자를 이용한 토큰들출력, (문자열부분,변수값)
		System.out.println(name + "의 나이는" + age +"이고, 키는" +height+ "입니다");
		
		//printf : 포맷을 이용한 변수 출력방식
		//%s :: string : 문자열
		//%d :: int : 정수
		//%f :: float : 실수
		System.out.printf("%s의 나이는 %d이고,키는%f입니다", name,age,height);
		Scanner sc = new Scanner(System.in);
		//String a = sc.next();

		//int num1 = sc.nextInt();
		//int num2 = sc.nextInt();
		//int num3 = sc.nextInt();
		//System.out.println("num1,num2,num3의 값:" +num1 +num2+num3  );
		//System.out.println("num1의 값:" +num1 );
		//System.out.println("num2의 값:" +num2 );
		//System.out.println("num3의 값:" +num3 );
		
		
		//String a = sc.next();
		//String b = sc.next();
		//String c = sc.next();

		//System.out.println("a의 위치에있는사람의이름은 " +a+"입니다" + "b의 위치에있는사람의이름"+b+"c의 위치에있는사람의이름"+c);
		//nextLine() :
				
		
		Scanner sc = new Scanner(System.in);

		String str4 = sc.nextLine();
		String str5 = sc.nextLine();
		String str6 = sc.nextLine();
		String str7 = sc.nextLine();
		System.out.println(str4);
		System.out.println(str4+str5);
		System.out.println(str5+str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str6+str7);
		System.out.println(str7+str6);
		System.out.println(str7);



		

	}
}


