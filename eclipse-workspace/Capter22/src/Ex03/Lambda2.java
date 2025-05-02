package Ex03;
import java.util.Scanner; 

@FunctionalInterface
interface YValue {
    int cac(int number);
}

public class Lambda2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        YValue y_number = (x) -> (x * x) - (3 * x) + 7; 
        System.out.print("x에 해당하는 값을 입력해주세요");
        int num = sc.nextInt(); 
        System.out.println("y의값은 " + y_number.cac(num) + "입니다. "); 
    }
}
