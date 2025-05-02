package chapter15_array;
class BoxA4{
	public String name;
	public int age;
	BoxA4(String name,int age){
		this.name = name;
		this.age = age;
	}
}

public class Ex04_BoxArr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxA4[] ar = new BoxA4[4];		
		ar[0] = new BoxA4("ar[0]위치의데이터" , 1);
		ar[1] = new BoxA4("ar[1]위치의데이터" ,  2);
		ar[2] = new BoxA4("ar[2]위치의데이터" , 3);
		//ar[3].name="이순신";
		//ar[3].age=35;
		
		
		
		System.out.println(ar[0].name+","+ar[0].age);
		System.out.println(ar[1].name+","+ar[1].age);
		System.out.println(ar[2].name+","+ar[2].age);
		//System.out.println(ar[3].name+","+ar[3].age);

		
	}
}