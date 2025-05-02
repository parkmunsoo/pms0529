package chapter18;

enum Human2 { MAN, WOMAN }
enum Machine2{ TANK, AIRPLANE}

public class Ex02_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createUnit(Machine2.TANK);
		createUnit(Machine2.AIRPLANE);
//		enum에서 설정한 이름
		System.out.println(Machine2.TANK);
//		enum에서 설정한 이름
		System.out.println(Machine2.TANK.name());
//		enum에서 설정한 이름
		System.out.println(Machine2.TANK.toString());
		System.out.println(Machine2.TANK.ordinal());
		System.out.println(Machine2.TANK.values());
		
		System.out.println(Machine2.AIRPLANE);
	}
	public static void createUnit(Machine2 kind) {
		switch(kind) {
		case TANK:
			System.out.println("탱크를 만듭니다.");
			break;
		case AIRPLANE:
			System.out.println("비행기를 만듭니다.");
		}
	}
}








