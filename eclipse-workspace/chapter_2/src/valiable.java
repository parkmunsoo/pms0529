
public class valiable {

	
	public static void main(String[] args) {
	//변수선언하기
		// 자료형 변수이름 = 자료형에 맞는 값;
	int number = 10;
	System.out.println(number);
	
	String str = "안녕하세요";
	System.out.println(str);

	// 중복이름으로 변수선언을하지못한다
	// 카멜표기법을 사용하여 변수명을 작성하기
	// 변수명만 보고도 의미가 통하도록 작성하기
	// 자료형 , 반복문 등등 명령기능 예약어를 변수이름으로 사용불가
	// 상수 선언하기
	// 상수 : 한번 데이터를 저장하면 더 이상 바꿀 수 없는 저장공간
	// 상수 선언과 값 대입을 동시에 실행하기
	
	
	
	//[
	final int MAX_NUM = 10;
	//MAX_NUM = 20; 추가로 값을 변경할 수 없음
	System.out.println(MAX_NUM);
	//]
	
	
	//[
	final int MIN_NUM;
	MIN_NUM = 6;// 값을 대입한 적이 없기때문에 실행가능
	//MIN_NUM =3; // final이할당된변수이기에 이중할당불능
	//상수 사용시 주의점
	//1. 한번 대입을 하면 두번째 대입은 불가능(값 변경 불가능)
	//2. 언더스코어 표기법으로 상수 이름 설정 (MAX_NUM_ , FIRST_NAME...)
	// 숫자를 직접적을 적으면 모두 int타입으로 만들어지고 byte에저장시 byte타입의장공간을가짐
	byte a = 100;
	byte b = 127;	// [min:0 ,max:127]
	long c = 1;
	long d = 1234L;	
	
	float f =3.14f;
	double g = 3.14;
	
	
//[
	//[
	byte num1 =3;
	byte num2 = 2;
	//]
	int result2 = num1 + num2;
	System.out.println(result2);
		//]

	
	//수동형변한(cast)	: (자료형)변수명
	byte result3 = (byte)(num1 + num2);
	
	//산술연산자 : +,-,*,/,%
	//대입연산자 : = , += , -= , *= , /=
	//비교연신자 : == , != , < , <= , > , >=
	//논리연산자 : &&(and) , ||(or) , !(not)
	//삼항연산자 : 조건식 ?(*조건) true : false
	}
}
