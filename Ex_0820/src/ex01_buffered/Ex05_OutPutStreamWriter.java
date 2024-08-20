package ex01_buffered;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex05_OutPutStreamWriter {

	public static void main(String[] args) {
		FileOutputStream in  = null;
		OutputStreamWriter is = null;
		
		try {
			in = new FileOutputStream("D:\\web0900_ysb\\1.java\\work\\examplefile/out예제.txt");
			is = new OutputStreamWriter(in,"UTF-8");
			
			System.out.println("파일 생성 시작");
			
			String[] strArray = {
					"OutputStreamWriter에 대해서 배웁니다."
					,"we are learning about OutputStreamWriter"};
			
			for(String str: strArray) {
				is.write(str+"\n");
			}
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(is != null) {
					is.close();
				}
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		

	}

}
