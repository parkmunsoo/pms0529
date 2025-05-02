package Ex03;

interface Unit7{
	void move(String s);
}
public class Ex_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//람다식의 경우 인터페이스에 있는 하나의 메서드를 구현할수 있음
		Unit7 unit = (String s)    ->
		{
			System.out.println(s);
		};
		unit.move("람다식으로 실행");
		
		Unit7 unit2 = new Unit7() {
			@Override
			public void move(String s) {
				System.out.println(s);
			}
		};
		unit2.move("익명 내부 클래스로 실행");
	}

}













