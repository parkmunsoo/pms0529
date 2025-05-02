package chapter15_array;

public class EX01_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : 데이터들이 특정타입을가지며 각자 서로다른 위치로써구분지어진다
		//자료향[] 변수이름 = new 자료형[배열의길이]
		int[] intArr = new int[3]; //int값을 3개저장할 수 있는 배열선언
		double[] doubleArr = new double[4];
		String[] strArr = new String[5]; 
		System.out.println(intArr.length);
		System.out.println(doubleArr.length);
		System.out.println(strArr.length);
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
//		System.out.println(doubleArr[3]);
		//System.out.println(strArr[3]);
		
		int[] intArr2 = {90,50,70,30};
		String[] strArr2 = {"국어","영어","수학","과학"};
		System.out.println(strArr2[1]);

	}
}
