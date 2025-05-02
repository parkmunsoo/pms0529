package Ex03;

import java.util.stream.IntStream;

public class Ex06_Pre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		package chapter23;

		import java.util.Arrays;
		import java.util.List;
		import java.util.stream.IntStream;

		public class Ex06_PreTeminal {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				List<Integer> list = Arrays.asList(1,3,5,6,9);
				int [] arr = {1,3,5,7,9};
//				최종연산 : 마지막에 한번만 사용 가능, 최종연산전의 중간연산의 경우 여러개 사용 가능
				int sum = Arrays.stream(arr)
						.sum();
				System.out.println("sum = " + sum);
				
				long cnt = IntStream.of(1,3,5,7,9)
						.count();
				System.out.println("count = " + cnt);
				
				IntStream.of(1,3,5,7,9)
				.average()
				.ifPresent(avg -> System.out.println("avg = "+avg));
				
				IntStream.of(1,3,5,7,9)
				.min()
				.ifPresent(min -> System.out.println("min = "+min));
				
				IntStream.of(1,3,5,7,9)
				.max()
				.ifPresent(max -> System.out.println("max = "+max));
			}

		}









}
