package chapter7;

public class Ex01_if {
	public static void main(String[] args){
	//	if($what if_a$) {
		//	$CODE_a1$
		//	$CODE_a2$
	//	}else if($what if_b$) {
	//		$CODE_b1$
	//		$CODE_b2$
	//	}
	//	else($what if_not(a,b)$){
	//		$CODE_c1$
	//		$CODE_c2$
//		}
		
		int money = 5000;
		if(money >= 3000) {
			System.out.println("택시를탑니다");}
		if(money >=1500 && money < 3000) {
			System.out.println("버스를탑니다");}		
		if(money < 1500) {
			System.out.println("걸어갑니다");}	
	}
}
