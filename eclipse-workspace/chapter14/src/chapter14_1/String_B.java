package chapter14_1;

public class String_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String의 단점: class타입적용을받는 자료형이라서 메모리단위를크게차지함
		
		StringBuilder buf = new StringBuilder("동해물과");
		//추가 append 
		buf.append("백두산이");
		System.out.println(buf.toString());		//형태 buf. // 형태와해당형태의변환 buf.toString()
		//추가 append
		buf.append(12345);
		System.out.println(buf.toString());
		//구간삭제
		buf.delete(0, 4);
		System.out.println(buf.toString());
		//값변경 replace
		buf.replace(4, 8, "ABC");
		System.out.println(buf.toString());
		//순서반전  reverse
		
		
				//str
		StringBuilder str = new StringBuilder("");
		buf.reverse();
		System.out.println(buf.toString());
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		//long Timeflow = System.currentTimeMillis(int 10);
		
		
				//str2
		StringBuilder str2 = new StringBuilder("");
		System.out.println(startTime);
		for(int i=0; i<10000; i++) {
			str2.append("apple");
			}
//		System.out.print;
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println("연산시간" + (endTime-startTime) );
		
		//StringBuilder와 StringBuffer의 공통 = 실행내용
		//StringBuilder와 StringBuffer의 차이 = 타입검사를지님(StringBuffer)

		
	}

}
