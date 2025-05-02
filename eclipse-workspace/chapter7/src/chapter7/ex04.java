package chapter7;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static int static_A;
// main메서드안의 어디서든사용가능 =myState,num1
// 클래스변수::멤버변수::인스턴스변수::위치:클래스이름아래
// 지역변수::로컬변수
		// main메서드는 프로그래밍을 실행하는 메서들 작성되어있는 클래스의 코드화를일으키지는않음
		// 프로시저, MAIN IN 프로시저 ,  프로시저실행=>프로세서
		boolean myState = true;
		int num1 = 11;
		if(myState){
			num1++;
			System.out.println(num1);
		}
		// {}안에서 선언한 변수는 중괄호 밖에서 사용할 수 없습니다.
		// System.out.println(num2);
		
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
		
		//System.out.println(i);

		
		
		
		
		int add(int a , int b) {
			System.out.println(staticA+","+a);
		}
	}

}
