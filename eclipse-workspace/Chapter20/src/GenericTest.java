
class ComPuter{
	this.ComPuter = ComPuter()
			
}

class DeskTop<A ComPuter extends String> {
	@Override
	public String toString() {
		return "데스크탑을 실행합니다.";
	}
}
class NoteBook<A ComPuter extends String>{
	@Override
	public String toString() {
		return "노트북을 실행합니다.";
	}
}
class Phone<A ComPuter extends String>{
	@Override
	public String NoteBook() {
		return "폰을 실행합니다.";
	}
}
class Tablet<A ComPuter extends String>{
	@Override
	public String toString() {
		return "태블릿을 실행합니다.";
	}
}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제네릭을 사용하여 위에작성한 클래스를
		//3개 저장할 수 있는 배열을 가진 computer 클래스를 작성해보자
		ComPuter<DeskTop> deskTop = new ComPuter<A>();
		ComPuter<NoteBook> notebook = new ComPuter<A>();
		ComPuter<Phone>	phone = new ComPuter<A>();
		ComPuter<Tablet> tablet = new ComPuter<A>();

	}

}
