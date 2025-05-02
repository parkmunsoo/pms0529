package Chapter23;
import java.util.*;

public class Ex01_ {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		
		float Input_data = sc.nextFloat();
		List<String> list = new ArrayList<>();
		list.add("A"); //list.get(0)
		list.add("B"); //list.get(1)
		list.add("C");//list.get(2)
		list.add("D");
		list.add("E");

		float A = 4.0f;
		float B = 3.0f;
		float C = 2.0f;
		float D = 1.0f;
		float E = 0.0f;


		if(Input_data >= A){
			System.out.println(list.get(0));
		}
		else if(Input_data >= B){
			System.out.println(list.get(1));
		}
		else if(Input_data >= C){
			System.out.println(list.get(2));
		}
		else if(Input_data >= D){
			System.out.println(list.get(3));
		}
		else if(Input_data >= 5.0){
			System.out.println("다시입력해주세요");
		}
		else{
			System.out.println(list.get(4));
			}

		
		
		//________________HASHMAP_
		Scanner sc2 = new Scanner(System.in); // Scanner 객체 생성
		float Input_data2 = sc2.nextFloat();
		HashMap<Float,String> Level = new HashMap<>();
		Level.put(A, "A");
		Level.put(B, "B");
		Level.put(C, "C");
		Level.put(D, "D");
		Level.put(E, "E");
		
		String Level_Cheak = Level.get(Input_data2);
		System.out.println(Level_Cheak);


	

	}

}
