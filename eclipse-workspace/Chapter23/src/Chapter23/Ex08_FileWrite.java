package Chapter23;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex08_FileWrite {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Writer out = new FileWriter("text.txt")) {
			for (int ch = (int) 'A'; ch < (int) ('Z' + 1); ch++) {
				out.write(ch);
			}
			
			//CR:13
			out.write(13);
			//LF:10
			out.write(10);

			for (int ch = (int) 'A' + 32; ch < (int) ('Z' + 1 + 32); ch++) {
				out.write(ch);
			}
			//CR:13
			out.write(13);
			//LF:10
			out.write(10);
//_____________________텍스트1___________________________
			out.write("동해물rhk 백두산이 마르고 닳도록");
//______________"\r\n" : enter_blank___________________________
			out.write("\r\n");
//_____________________텍스트2___________________________
			out.write("하느님이 보우하사 우리나라 만세");
//______________"\r\n" : enter_blank___________________________
			out.write("\r\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
