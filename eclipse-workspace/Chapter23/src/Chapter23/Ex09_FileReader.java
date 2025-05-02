package Chapter23;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex09_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Reader in = new FileReader("text.txt")){
			int ch;
			while(true) {
				ch = in.read();
				if(ch == -1) {
					break;
				}
				System.out.print((char)ch);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}







