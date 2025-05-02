package ex09;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ex09 {
	public static void myMethod1() throws InputMismatchException, ArithmeticException, Exception {
		myMethod2();
	}
	public static void myMethod2() 
	   throws ArithmeticException , InputMismatchException, Exception{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = 10/num1;
		System.out.println(num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//myMethod1();
		}catch(ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("Good Bye~~!");
	}
}
