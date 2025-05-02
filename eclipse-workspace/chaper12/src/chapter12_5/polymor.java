package chapter12_5;

abstract class Calc {
	int a = 5;
	int b = 6;

	void plus() {
		System.out.println(a + a);
	}
}

class MyCalc extends Calc {

	@Override
	void plus() {
		System.out.println(a + b);
	}

	void minus() {
		System.out.println(a - b);
	}
}

class YourCalc extends Calc {

	@Override
	void plus() {
		System.out.println(a + b + "YourCalc의 plus결과");
	}

	void minus() {
		System.out.println(a - b + "YourCalc의 minus결과");
	}
}

class polymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc myCalc1 = new MyCalc();
		myCalc1.plus();
//		자식클래스에서 추가한 메서드를 실행
		myCalc1.minus();
		Calc myCalc2 = new MyCalc();
		myCalc2.plus();
		MyCalc changeCalc = (MyCalc) myCalc2;
		changeCalc.minus();

		Calc yourCalc1 = new YourCalc();
		yourCalc1.plus();
		YourCalc changeCalc2 = (YourCalc)yourCalc1;
		changeCalc2.minus();
	}
}