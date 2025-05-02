package chapter17;

class Book2{
	Long id;
	String name;
	String author;
	Book2(String name, String author){
		this.name = name;
		this.author = author;
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	// String 타입인 name의 equals를 이용하여 obj의이름을비교. 
	// obj.toString() : Book2의 toString이 실행되어 name을반환
	public boolean equals(Object obj) {
		//String 타입인 name의 equals
		String str = this.toString();
		return name.equals(obj.toString());
	}
}
	
public class ex05_eq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			equals : Object클래스에 있는 메서드로 인스턴스끼리 비교할때 사용
//			equals는 오버라이딩 하지 않으면 메모리주소끼리 비교, ==으로 비교하는것과 같음
		Book2 book1 = new Book2("자바 프로그래밍", "이재환");
		Book2 book2 = new Book2("HTML", "이재환");
		Book2 book3 = new Book2("자바 프로그래밍", "이재환");
//			false가 나오는 이유 : 두개의 인스턴스 모두 new를 이용하여 작성했기 때문에 다른 객체
		System.out.println(book1 == book3);
		System.out.println(book1.equals(book3));
	}
}

