package javabasic.io;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFileExer {

	public static void main(String[] args) {

		FileWriter fw = null;
		FileWriter fw2 = null;
		FileReader fr = null;

		try {
			fw = new FileWriter("C:\\Users\\Administrator\\git\\java\\javabasic\\src\\assets\\diary.txt");
			fr = new FileReader("C:\\Users\\Administrator\\git\\java\\javabasic\\src\\assets\\diary.txt");
			fw2 = new FileWriter("C:\\Users\\Administrator\\git\\java\\javabasic\\src\\assets\\diary_copy.txt");

			fw.write("5월 10일의 일기\n\n오늘도 열심히 공부를 했다. \n내일은 뭐하지");
			fw.flush();

			char[] readChars = new char[8];
			int offset = 0;
			int readCount = 0;
			while ((readCount = fr.read(readChars, 0, readChars.length)) > -1) {
				fw2.write(readChars,0, readCount);
				
				
//			System.out.print(readChars);
//			if(readCount<readChars.length) {
//				break;
//			}
			}
			fw2.flush();

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}// main

}// class
