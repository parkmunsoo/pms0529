package chapter18;

public class Ex03Var {
	public static void helloEverybody(String... vargs)
	{
		for (String s : vargs) {
			System.out.println(s + '\t');
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		helloEverybody("홍길동");
		helloEverybody("홍길동","전우치");
		helloEverybody("홍길동","전우치","손오공");
		helloEverybody("홍길동","전우치","손오공","홍길동");
		helloEverybody("홍길동","전우치","손오공","홍길동","전우치");

		
		
		
	}
		
}
