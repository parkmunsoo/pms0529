package pract;

class MyPoint {
	int a;
	int b;
	MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MyPoint(" + a + "," + b + ")";
	}
}

public class practice1 {

	public static void main(String[] args) {
		MyPoint A = new MyPoint(5, 10);
		System.out.println(A); // a는 자동으로 a.toString()으로 변환됨
	}

}

// 결과값으로 MyPoint(3,20) 을나타내야됨 