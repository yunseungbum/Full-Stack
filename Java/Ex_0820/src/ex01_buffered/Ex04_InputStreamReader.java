package ex01_buffered;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex04_InputStreamReader {
	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			in = new FileInputStream("D:\\web0900_ysb\\1.java\\work\\EX_0730_first/exam.txt");
			is = new InputStreamReader(in,"UTF-8");
			int read = 0;
			
			while((read = is.read()) != -1) {
				System.out.println((char)read);
			}
			is.close();
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
