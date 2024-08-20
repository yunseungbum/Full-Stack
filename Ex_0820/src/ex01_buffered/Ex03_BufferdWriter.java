package ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03_BufferdWriter {
	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader br = null;
		
		FileWriter writer = null;
		BufferedWriter bw = null;
		
		
		try {
			reader = new FileReader("D:\\web0900_ysb\\1.java\\work\\EX_0730_first/1일차.txt");
			writer = new FileWriter("D:\\web0900_ysb\\1.java\\work\\EX_0730_first/book_copy.txt");
			
			//보조스트림 생성하기
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			
			//문장을 저장할 변수
			String str = "";
			
			while((str = br.readLine()) != null) {
				System.out.println(str+"\n");
			}
			System.out.println("텍스트 파일 복사 완료");
			//메모장에 있는 내용을 읽어와서 복사하기
			//readLine(), write();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(writer != null) {
					writer.close();
				}
				
				if(br != null) {
					br.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	}

	}
}
