package chapter17;

public class Ex11_AutoBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//오토박싱
		Integer num = 10;
		// 오토박싱과 오토언박싱 동시시행
		num++;
		System.out.println(num);
		num += 3;
		System.out.println(num);
		//오토 언박싱 진행
		int r = num +5;
		//오토 언박싱 진행 + 오토 박싱 진행
		Integer rOj = num -5;
		System.out.println(r);
		System.out.println(rOj);
		Integer iObj = 10;
		Double dObj = 3.14;
		

		
		iObj = iObj+10;
		dObj = dObj+1.2;
		System.out.println(iObj);
		System.out.println(dObj);

	}
}
