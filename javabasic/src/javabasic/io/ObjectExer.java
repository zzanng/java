package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectExer {

	
	public static void main(String[] args) {
		
		Person hong = new Person("홍길동",20,"123456-1234567");
		Person kang = new Person("강길동",30,"564562-1456755");
		
		File file = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
		try {
			file= new File ("C:\\Users\\Administrator\\git\\java\\javabasic\\src\\assets\\Object.dat");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(hong);
			oos.writeObject(kang);//직렬화 하는 메소드 
			
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			Object hongObj = ois.readObject();
			Object kangObj = ois.readObject();
			
			Person readHong =(Person)hongObj;
			Person readkang =(Person)kangObj;
			System.out.println(readHong);
			System.out.println(readkang);
			
			
		}catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();		
		}catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();

		}
	
	
	
	
	}
}
