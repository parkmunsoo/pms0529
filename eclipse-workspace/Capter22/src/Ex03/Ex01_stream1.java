package Ex03;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Ex01_stream1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		스트림에 사용할 배열 선언
		int [] arr = {1,2,3,4,5};
//		스트림 생성
		IntStream stm1 = Arrays.stream(arr);
//		중간연산중 하나인 filter를 실행

		IntStream stm2 = stm1.filter( n -> n%2 == 1);
		int sum = stm2.sum();
		System.out.println(sum);
		
//		파이프라인 : . 을 이용하여 메서드의 실행을 계속해서 하는 방식
		int sum2 = Arrays.stream(arr).filter( n -> n%2 == 1).sum();
		System.out.println("파이프라인으로 실행한 결과:"+sum2);
	}

}
