package chaper12;
class Unit{
	String name;
	int hp;
	void printUnit() {
		System.out.println("이름:"+name);
		System.out.println("HP:"+hp);
	}
	void doMove() {
		System.out.println("이동속도 10으로 이동");
	}
//	void printMarine() {
//		printUnit;
//	}
	//@ override
	//오버라이드 어노테이션 : 오버라이딩이 정상적으로작성되었는지확인하는 어노테이션

	
class Marine extends Unit{
	int attack;
	void printMarine()
	{
		printUnit();
		System.out.println("공격력:" + attack);
	}
}
class Medic extends Unit{
	int heal;
	void printMedic()
	{
		printUnit();
		System.out.println("치유량:"+heal);
	}
}

public class MyTerran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine unit1 = new Marine();
		unit1.name = "마린";
		unit1.hp = 100;
		unit1.attack= 20;
		
		Medic unit2 = new Medic();
		unit2.name = "메딕";
		unit2.hp = 120;
		unit2.heal= 10;
		unit1.printMarine();
		System.out.println();
		unit2.printMedic();


	}
	
	


}
