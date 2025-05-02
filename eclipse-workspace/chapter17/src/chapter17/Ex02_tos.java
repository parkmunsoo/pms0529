package chapter17;
import java.util.Scanner;

//Scanner sc = new Scanner(System.in);
class Book{
	String name;
	String author;
	@Override
	public String toString() {
		return this.name+","+this.author;
	}
}
public class Ex02_tos {
	//System.out.println("");
	public static void main(String[] args) {
		//toString 메서드를 오버라이딩 하지않으면 아래의내용이출력
		//패키지명.클래스명@16진수메모리주소
		Ex02_tos ex02 = new Ex02_tos();
		System.out.println(ex02);
		System.out.println(ex02.toString());
		Object obj = new Object();		
		String name = "홍길동";
		System.out.println(name);
		System.out.println(name.toString());
		System.out.println(obj);
		Book book1 = new Book();
		book1.name = "자바 프로그래밍";
		book1.author = "이재환";
		System.out.println(book1.toString());
		System.out.println(book1);
		}
}
