package Chapter23;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02_FileW {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream out = null;
		try {
			//입출력 스트림은 예외처리를해야함 (try,catch) , (throws IOException);...
			out = new FileOutputStream("data.txt");
			out.write(65); //ASCII:65 = A 
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//임출력 스트림이 만들어져 있는지 확인
			//스트림이 null인 상태로 close()를 실행하면 에러가 발생합니다
			if(out != null) {
				try {
					out.close();
				}catch(IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}











