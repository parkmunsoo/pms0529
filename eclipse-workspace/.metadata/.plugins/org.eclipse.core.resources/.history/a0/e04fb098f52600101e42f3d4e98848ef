package Chapter23;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex0_4FileR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일읽기
		try (InputStream in = new FileInputStream("data.txt")){
			int dat = in.read();
			System.out.println(dat + " dat");
			System.out.printf("%c \n", dat);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}




