package chapter7;
import java.util.Scanner;

public class Ex02_if {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("시험점수를 판별하기위한 숫자를 입력해주세요");
		int TEST_score = sc.nextInt();
		int NA = 100;
		int A = 90;
		int B = 80;
		int C = 70;
		int D = 60;
		
		if(TEST_score > NA ){
			System.out.println("무효처리");}
		else if(TEST_score >= A) {
			System.out.println("A등급입니다");}
		else if(TEST_score > B) {
			System.out.println("B등급입니다");}		
		else if(TEST_score > C ) {
			System.out.println("C등급입니다");}	
		else if(TEST_score > D) {
			System.out.println("D등급입니다");}	

		
		
		
		
		System.out.println("홀수/짝수를 판별하기위한 숫자를 입력해주세요");
		int numm = sc.nextInt();
		System.out.println("입력으로 주어진숫자는" +numm+"입니다");
		if(numm%2  == 0) {
			System.out.println("짝수입니다");
		}
		else if(numm%2 != 0) {
			System.out.println("홀수입니다");
		}
		
		
		System.out.println("해당값을 입력함에따른 출력에대한 값을 판별하기위해 임의의숫자를 입력해주세요");
		int numm_a = sc.nextInt();
		
		if(numm_a < 0){
			numm_a = 0;
		}
		
		int numm_b = numm_a +20;
		if(numm_b >255) {
			numm_b = 255;
		}
		System.out.println("결과값은 "+numm_b+"입니다");

		
		
		
		
		
		
	}
}
