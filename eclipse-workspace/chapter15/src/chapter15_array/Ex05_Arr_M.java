package chapter15_array;
import java.util.Arrays;

public class Ex05_Arr_M {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] arr = makeIntArray(5);
		int sum = sumOfArray(arr);
		System.out.println(sum);
		String str = "010-1234-5678";
		String[] strSplit = str.split("-");
		System.out.println(Arrays.toString(strSplit));
	}



public static int[] makeIntArray(int len) {
	int[] arr = new int[len];
	for(int i=0; i<len; i++) {
		arr[i] = i;
	}
	return arr;
}
public static int sumOfArray(int[] arr) {
	int sum = 0;
	for(int i=0; i<arr.length; i++) {
		sum = sum + arr[i];
	}
	return sum;
}
}

