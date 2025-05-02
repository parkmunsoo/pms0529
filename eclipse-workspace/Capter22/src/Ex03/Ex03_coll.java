package Ex03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Ex03_coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,3,2,4};
		List<Integer> list = new ArrayList<>();
		for(int i : arr) {
			if(i%2 == 1) {
				list.add(i);
			}
		}
		Collections.sort(list);
		for(int i:list) {
			System.out.print(i + "\t");
		}
		System.out.println();
		//Stream을 이용하는 방식
		Arrays.stream(arr)
		.filter(n->n%2==1)
		.sorted() // list 오름차
		.forEach(n->System.out.print(n+"\t"));
		System.out.println();
		
	}
}
