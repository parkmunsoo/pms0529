package Chapter23;
import java.util.*;




class Student{
	String name;
	String dept;
	int dno;
	double score;
	public Student(String name, String dept, int dno, double score) {
		this.name = name;
		this.dept = dept;
		this.dno = dno;
		this.score = score;
	}
	@Override
	public String toString() {
		return this.name+","+this.dept+","+this.dno+","+this.score;
	}
}

public class Q4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		HashMap<String, Student> studentMap = new HashMap<>();
		System.out.println("--------------------------------------------");
		System.out.println("학생이름, 학과, 학번, 학점을 입력하세요.");
		while (studentList.size() < 5) {
			System.out.print(">>");
			String name = sc.next();
			String dept = sc.next();
			int dno = sc.nextInt();
			double score = sc.nextDouble();
			studentList.add(new Student(name, dept, dno, score));
			studentMap.put(name, new Student(name, dept, dno, score));
		}
		for (String key : studentMap.keySet()) {
			System.out.println("-----------------------------");
			Student s = studentMap.get(key);
			System.out.println("이름 : " + s.name);
			System.out.println("학과 : " + s.dept);
			System.out.println("학번 : " + s.dno);
			System.out.println("학점 : " + s.score);
		}
		while(true) {
			System.out.print("학생 이름 >>");
			String input = sc.next();
			if(input.equals("그만")) {
				System.out.println("End");
				break;
			}
//			list 데이터 찾기
			for(Student stu : studentList) {
				if(stu.name.equals(input)) {
					System.out.println(stu);
				}
			}
//			map 데이터 찾기
			Student stu = studentMap.get(input);
			System.out.println(stu);
			
//		이름 : 홍길동 
//			학과 : 모바일 
//			학번 : 1 
//			학점 : 4.1 
		}
	}
}
