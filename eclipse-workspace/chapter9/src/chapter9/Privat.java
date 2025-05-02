package chapter9;
public class Privat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//접근제한자 생략 : 같은 패키지 내부에서만 접근가능
		//public : 패키지에관계없이 어디서든 접근가능
		//private : 같은 클래스 내부에서만 접근가능
			//private걸린 변수는 다른클래스에서 접근불능
		//protected : 같은 패키지 내부와 상속 관계의 클래스에서만 접근가능
		Student1 student1 = new Student1();
		student1.name = "홍길동";
		student1.age = -20;
		System.out.printf("%s의 나이는 %d살입니다. \n",
				student1.name,student1.age);
		Student2 student2 = new Student2("전우치",20);
		student2.name = "손오공";
		student2.setAge(-10);
		int age = student2.getAge();
		System.out.printf("%s의 나이는 %d살입니다. \n",
				student2.name,age);
	}

	class Student1{		
		public String name;
		private int age;
		public String Student1;
			
		}
	class Student2{		
		public String name;
		private int age;
		public String Student2;
	}
	public void setAge(int age) {
		if(age<0||age>150) {
			System.out.println("나이가 부적절합니다");
			this = 0;
			return;
		}
		this.age = age;
		}
	}
	

