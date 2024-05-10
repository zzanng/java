/*studentscore 데이터클래스생성 (int sno String name int kor int eng int math int total
 * IOExer에서 5개의 StudentScore 객체 생성후 asset / studentscore.dat 에 직렬화
 * 직렬화된 객체를 역직렬화하여 힉셍성적 데이터에 출력 
 * 출력시 과목별 총점도 출력  
 * 
 */

package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOExer {

	public static void main(String[] args) {

		List<StudentScore> ssList = new ArrayList<StudentScore>();
		ssList.add(new StudentScore(1, "홍길동", 100, 100, 100, 0));
		ssList.add(new StudentScore(2, "강길동", 90, 90, 90, 0));
		ssList.add(new StudentScore(3, "김길동", 80, 80, 80, 0));
		ssList.add(new StudentScore(4, "이길동", 70, 70, 70, 0));
		ssList.add(new StudentScore(5, "오길동", 60, 60, 60, 0));

		File file = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			file = new File("C:\\Users\\Administrator\\git\\java\\javabasic\\src\\assets\\StudentScore.dat");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ssList);

			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			List<StudentScore> readList = (ArrayList<StudentScore>) ois.readObject();
			int korTotal =0;
			int engTotal =0;
			int mathTotal =0;
			for(StudentScore ss: readList) {
				ss.setTotal(0);
				korTotal +=ss.getKor();
				engTotal +=ss.getEng();
				mathTotal +=ss.getMath();
				
				System.out.println(ss);
			}
			System.out.println("국어 총점: "+korTotal+" 영어 총점: "+engTotal+" 수학 총점: " +mathTotal);
			
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
