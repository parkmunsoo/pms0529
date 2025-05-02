package chaper12;


final class Unit{
	final void deMove() {
		System.out.println("이동합니다.");
	}
}
// final class인 unit은 상속할 수 없음 => 에러발생
class Marine extends Unit{
	
}
public class ex02_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언시 사용하는 final => 상수선언으로 변경됨
		final int MAX_NUM = 10;
//class Marine extends Unit{
//	//unit의 doMove는 final로 작성되었기때문에 오버라이딩이불가능함
//}
		
	}
}
