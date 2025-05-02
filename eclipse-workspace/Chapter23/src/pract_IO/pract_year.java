package pract_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class pract_year {
    public static void main(String[] args) {
        int first_year = 1900;
        int last_year = 2025;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("year.txt"))) {
            for (int year = first_year; year <= last_year; year++) {
                if ((year % 4 == 0 && year % 100 != 0)) {
                    writer.write(year + "\n");
                }
            }
            writer.write("작성완료" + "\n");
            System.out.println("성공");
        } catch (IOException e) {
            System.out.println("오류");
        }
    }
}