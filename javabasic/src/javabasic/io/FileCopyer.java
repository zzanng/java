/*IO 실습 
 * asset 폴더에 이미지파일 하나 ㅡ문자파일하나 준비 
 * 
 * 1. 사옹자에게1,2 입력받는다 
 * 2. 사용자가 1을 입력하면 이미지 파일을 복사 assets에 저장 
 * 3. 사용자가 2를 입력하면 문자파일을 복사 assets에 저장 
 * 파일명은 image.jpg -> image_copy.jpg
 * 파일명은 text.txt ->  text_copy.txt
 * 
 * 
 * 
 */

package javabasic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyer {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		FileReader fr = null;
		FileWriter fw = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("1이나 2입력해주세요.");
		String inputValue = sc.next();
		if (inputValue.equals("1")) {
			// 이미지파일 복사

			try {

				fis = new FileInputStream("C:\\Users\\Administrator\\git\\java\\javabasic\\src\\assets\\image.jpg");
				fos = new FileOutputStream(
						"C:\\Users\\Administrator\\git\\java\\javabasic\\src\\assets\\image_copy.jpg");

				byte[] readByte = new byte[1024];
				int byteCount = 0;
				while ((byteCount = fis.read(readByte)) > -1)
					;
				{
					fos.write(readByte, 0, byteCount);

				}
				fos.flush();

			} catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				try {
					fos.close();
					fis.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}

			}

		} else if (inputValue.equals("2")) {
			// 텍스트파일 복사

			try {
				fr = new FileReader("C:\\Users\\Administrator\\git\\java\\javabasic\\src\\assets\\text1");
				fw = new FileWriter("C:\\Users\\Administrator\\git\\java\\javabasic\\src\\assets\\text1_copy");


				char[] readChars = new char[8];
				int offset = 0;
				int charCount = 0;
				while ((charCount = fr.read(readChars)) > -1) {
					fw.write(readChars, 0, charCount);
				}

				fw.flush();
				
			} catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				try {
					fw.close();
					fr.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}

		}

	}
	//

}
