//collection 실습
// 3개의 반에 각각 3명의 국어영수 점수가 있다. 
//반별 각각 학생의 국영수 총점을 산출해 반 이름,총점을 출력하는 프로그램을 만들어 보자 

//

package javabasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CollectionExer {
	
	public static void main(String[] args) {
		
		
	Student s11 = new Student(1,1,"0길동",100,100,100, 0);
	Student s12 = new Student(1,2,"1길동",90,90,90, 0);
	Student s13 = new Student(1,3,"2길동",80,80,80, 0);
	Student s21 = new Student(2,1,"3길동",70,70,70, 0);
	Student s22 = new Student(2,2,"4길동",60,60,60, 0);
	Student s23 = new Student(2,3,"5길동",50,50,50, 0);
	Student s31 = new Student(3,1,"6길동",40,40,40, 0);
	Student s32 = new Student(3,2,"7길동",30,30,30, 0);
	Student s33 = new Student(3,3,"8길동",20,20,20, 0);
		

//	Map<String, Student>map = new LinkedHashMap<String, Student>();
	Map<String, Student>map = new HashMap<String, Student>();

	map.put("s11", s11); 	map.put("s12", s12); 	map.put("s13", s13);
	map.put("s21", s21);	map.put("s22", s22);	map.put("s23", s23);
	map.put("s11", s31);	map.put("s32", s32);	map.put("s33", s33);	
	
//	Collection<Student> coll = map.values();
//	coll.forEach(student -> System.out.println(student));
	//위아래 같음
	Collections.sort(coll, (ss1, ss2) -> (ss1.get));
	
	
	map.values().forEach(student -> System.out.println(student));
	
	
	

}//main
	
}//class














