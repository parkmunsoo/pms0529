package chapter18;
interface Unit5{
//	JavaDoc 주석 : 자바 도큐먼트 주석
	/**
	 * @param str
	 */
	@Deprecated
	public void move(String str);
	public void run(String str);
}
class Human5 implements Unit5{
	@SuppressWarnings("deprecation")
	@Override
	public void move(String str) {
		System.out.println(str);
	}
	@Override
	public void run(String str) {
		System.out.println(str);
	}
	
	/**
	 * @param 
	 * @return
	 * @author 
	 * @see 
	 * @throws 
	 * @exception 
	 */
	public int test(String str) {
		return Integer.parseInt(str);
	}
}


public class Ex05_Dep {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit5 unit = new Human5();
		unit.move("인간형 유닛이 이동합니다.");
		unit.run("인간형 유닛이 이동합니다.");
		Human5 h5 = new Human5();
		int num = h5.test("5");
	}
}








