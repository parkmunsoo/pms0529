package chapter17;

public class Ex10_Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//박싱
		Integer iObj = Integer.valueOf(10);
		Double dObj = Double.valueOf(3.14);
		
		//메서드 호출을 통한 언박싱
		int num1 = iObj.intValue();
		double num2 = dObj.doubleValue();
		
		//메서드 출력(iObj , dObj)
		System.out.println(num1 + " : " + iObj);
		System.out.println(num2 + " : " + dObj);
		System.out.println();
		
		//래퍼 인스턴스 값의 증가방법
		iObj = Integer.valueOf(iObj.intValue() + 10);
		dObj = Double.valueOf(dObj.doubleValue()+1.2);
		
		System.out.println(iObj);
		System.out.println(dObj);
		
	}

}
