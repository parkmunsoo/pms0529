class Tank5{
	@Override
	public String toString() {
		return "This is a Tank2";
	}
}
class Npc5{
	@Override
	public String toString() {
		return "This is a Npc2";
	}
}
class Camp5<T>{
//	unit의 자료형(타입)을 T로 설정
	private T unit;
//	unit의 데이터 설정시 필요한 매개변수의 타입을 T로 설정
	public void set(T unit) {
		this.unit = unit;
	}
//	unit변수를 반환할때 사용할 반환타입으로 T를 설정
	public T get() {
		return unit;
	}
}
public class Ex05_MyGameGeneric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camp5<Npc5> human = new Camp5<Npc5>();
		Camp5<Tank5> machine = new Camp5<>();
		
		human.set(new Npc5());
		//human.set("나는문어");

		machine.set(new Tank5());
		//제네릭에서 기초자료형 불능 / 래퍼 클래스 가능
		Npc5 hUnit = human.get();
		Tank5 mUnit = machine.get();
		System.out.println(mUnit);
		System.out.println(hUnit);
		System.out.println(machine.get());
		System.out.println(human.get());
	}

}











