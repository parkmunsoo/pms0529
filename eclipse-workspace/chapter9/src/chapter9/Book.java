package chapter9;
public class Book {
	String title;
	int price;
	int num = 0;
	
	Book()
	{
		title = "자바프로그래밍";
		price =30000;
	}
	Book(String t , int p , int num){
		super();
		this.title = t;
		this.price = p;
		this.num = num;
	}
	int num = 1;
	void print() {
		System.out.println("제목:" + title);
		System.out.println("가격:" + price);
		System.out.println("주문수량:" + price);
		System.out.println("합계금액:" + price * num);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.print();
		Book book2 = new Book("자바 디자인패턴",35000);
		book2.num = 10;
		book2.print();
	}

}
