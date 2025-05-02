package chapter9;
//메서드 오버로딩: 매개변수의 개수나 자료형을 다루지만 메소드명은 같은 메소드명은 같은 메소드를 여러개정의하는방식



class Calc{
//메소드의 이름이 같아도 매개변수의 개수가 다르거나 자료형이 다르다면 다른 메소드로 생성가능
	int add(int a, int b) {
		return a+b;
	}
	int add(int a) {
		return a+1;
	}
	double add(double a, double b) {
		return a+b;
	}
	int add(double a) {
		return (int)a+1;
	}
	//반환타입은 다르지만 자료형의개수가같기에 에러발생
	double add(int a) {
		return a+1;
	}
}
public class Over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// println을 메서드 오버로딩을 이용하여 작성했기 때문에 매개변수의 타입에 상관없이 사용가능
		int i = 10;
		double d = 3.14;
		String s = "홍길동";
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		System.out.println();
	}

}
