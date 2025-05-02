package chapter16;
import java.util.Scanner;
public class ex07 {
	// TODO Auto-generated method stub
	public static void myMethod1() {
		myMethod2();
	}
	public static void myMethod2() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = 10/num1;
		System.out.println(num2);
	}
	public static void myMethod3() {
		myMethod4();
	}
	public static void myMethod4() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = 10/num1;
		System.out.println(num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			myMethod1();
			myMethod3();
			//throwable: try에서 실행한 메서드에서 예외발생
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Good Bye~~!");}}

