package chapter15_array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayEQ {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// TODO Auto-generated method stub
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
//
//		boolean bCheck = Arrays.equals(arr1, arr2);
//		System.out.println(bCheck);
//		
//		int[] arr3 = {1,2,3,4,5};
//		int[] arr4 = {1,2,3,4,5};
//		bCheck = Arrays.equals(arr1, arr2);
//		System.out.println(bCheck);
//
//		System.out.println(arr3 == arr4);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {1,3,2,4};
		Double[] arr2 = {4.4, 3.3, 2.2, 1.1};
		String[] arr3 = {"홍길동","전우치","손오공","멀린"};
		Arrays.sort(arr1, Collections.reverseOrder());
		Arrays.sort(arr2, Collections.reverseOrder());
		Arrays.sort(arr3, Collections.reverseOrder());
		for(int n:arr1) {
			System.out.print(n+"\t");
		}
		System.out.println();
		for(double d:arr2) {
			System.out.print(d+"\t");
		}
		System.out.println();
		for(String s:arr3) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}
}
