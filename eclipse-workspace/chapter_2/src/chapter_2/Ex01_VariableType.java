package chapter_2;

public class Ex01_VariableType {
	public static void main(string[] args)
	{
		// js의경우 변수의앞에 let으로 모든변수를 설정가능
		// java의경우 변수 선언시 자료형에 적합한 변수를 할당해야함 
		
		
		
		// byte[min: byte[0], max : byte[7] ]
		// bit : byte[n] , n-m =1 , m = n-1
		// 정수 숫자 자료형
		//byte : -128 ~ +127
		//short : -32,768 ~ +32,767
		// int : -2,147,483,648 ~ +2,147,483,647
		// long : -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
		
		
		
		//byte : -128 ~ +127
		byte b = 127;
		// long 자료형의경우 상수의마지막항다음 L을붙여 전체항을 표기해야함
		long l = 928842194128428L;
		// 21억보다 큰 값을 저장하는경우 long = nml...L;사용
		
		
		//문자 자료형
		//char : 한글자만 저장할 수 있는 자료형
		char c = 'a';
		c = 65;
		System.out.println(c);
		// string : 여러글자를 저장할 수 있는 자료형
		String str = "안녕하세요";
		System.out.println(str.length()); // str변수의 글자 수 출력
		Byte by = 'a';
		Short sh = 35;
		Interger in = 21;
		Long lo = 98L;

		// 첫글자가 대문자인 경우에는 클래스 자료형
		
		
		
		//실수 자료형 : 소수점을 저장하는 자료형
		float f = 3.14F;
		double d = 3.14;
		double num1 = 1.000001;
		System.out.println(num2);
		double result = num1+num2;
		System.out.println(result);
	}
}
