package java_project08;
import java.util.Scanner;
public class cacu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		//String str = sc.next(); // 입력받은 문자열을 str에 저장
		while(true){
			showMenu();
			//0~4번까지의 선택을 입력한 문자열의 첫글자만 저장
			int num = sc.nextInt();
			char myChar = sc.nextLine().charAt(0);
			// cheakNum메서드를 이용하여 입력한 문자열이 숫자인지 아닌지 확인
			
			
			//아스키코드에서 0을빼면 숫자값을 구할 수 있음
			if(!cheakNum(myChar)) {
				System.out.println("메뉴를 잘못 선택했습니다");
				continue;
			}
			if(num ==0) {
				System.out.println("계산기를종료합니다");
				break;
			}else {
				if(num>4) {
					System.out.println("메뉴를 잘못 선택했습니다");
					continue;
				}
				System.out.print("첫번째의 숫자는");
				int a = sc.nextInt();
				System.out.print("두번째의 숫자는");
				int b = sc.nextInt();
				sc.nextInt();
				// next(), nextInt(), nextDouble()같은자료형에 데이터들담는경우 엔터키가 스캐너에 잔류
				if(num == 1) {
					addN(a ,b);
					
				}
				else if(num == 2) {
					subN(a ,b);
				}
				else if(num == 3) {
					mulN(a ,b);
				}
				else if(num == 4) {
					divN(a ,b);
				}
			}
		}
	}
	
	
	
	
	public static void showMenu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("0. 종료하기");

	}
	public static void addN(int a , int b) {
		int result = a + b;
		System.out.println(a+"+"+b+"="+result);
	}
	public static void subN(int a , int b) {
		int result = a - b;
		System.out.println(a+"-"+b+"="+result);
	}
	public static void mulN(int a , int b) {
		int result = a * b;
		System.out.println(a+"*"+b+"="+result);
	}
	public static void divN(int a , int b) {
		int result = a / b;
		System.out.println(a+"/"+b+"="+result);
		 result = a % b;
		System.out.println(a+"%"+b+"="+result);
	public static boolean chk(char ch) {
		if(ch>='0'&&ch<='9') {
			return true;
		}
		else {
			return false;
			}
		}
	}
}
