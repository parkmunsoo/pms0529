package Chapter23;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class Ex03_FileW{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(OutputStream out = new FileOutputStream("data.txt");){
			out.write(65);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}









