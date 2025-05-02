package pract_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class prct1 {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("gugu.txt"))) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					String gugu = (i + "X" + j + "=" + (j * i) + " ");

					bw.write(gugu, 0, gugu.length());
					bw.newLine();

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//1. gugudan.txt 파일에 1단부터9단까지의 구구단을 출력해보자
//2. year.txt파일에 1900부터 2025까지의 윤년을 출력하자
//3.

//try(BufferedWriter bw = new BufferedWriter(new FileWriter("gugudan.txt"))){
//	bw.write(str(n), 0, str(i+"X" +  j + "=" + (j * i)).length());
//	bw.newLine();
//	bw.write(str2, 0 , str2.length());
//}catch(IOException e) {
//	e.printStackTrace();
//}
//}
