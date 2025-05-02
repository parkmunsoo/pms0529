import java.util.Random;
public class preload {
	static int num;
	static {
		Random rand = new Random();
		num = rand.nextInt(100);
	}
// static 사용시의단점
// 1.프로그램이 켜질때 시간이 오래걸림
// 2. 스태틱영역의 메모리는 프로그램이 꺼질때까지 지워지지않기에
// 메모리사용이 비효율적
// 3.객체지향 프로그래밍 원칙에위배된다
	public static void main(String[] args) {
		System.out.println(num);
	}
}