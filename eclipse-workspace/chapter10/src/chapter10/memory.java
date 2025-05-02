package chapter10;

public class memory {
	public static void main(String[] args) {
		//디버그모드 사용방법
		//버그모양버튼으로디버그모드실행
		// step(into,over,return)을이용하여 코드확인
		int num1 = 10;
		int num2 = 20;
		adder(num1,num2);
		System.out.println("-----------------");}
		public static int adder(int n1, int n2){
			int result = n1+n2;
			return result;
		}
}
