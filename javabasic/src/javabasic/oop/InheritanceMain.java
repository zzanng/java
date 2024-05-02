package javabasic.oop;

public class InheritanceMain {

	public static void main(String[] args) {
		
//		gp는 GarandParent 타입이고 가지고 있는 참조는 GarandParent타입이다. 
		GrandParent gp = new GrandParent ("홍할배",80,"산적");
		System.out.println(gp.name+ " 님은 " + gp.age + "살이고, 직업은 "+ gp.job);
		
//		Parent는 GarandParent 타입이고 가지고 있는 참조는 Parent 타입이다. 
		GrandParent parent = new Parent ("홍아범",50,"산적");  //상위형변환.
//		null 님은 0살이고, 직업은 null
//		Grandparent의 name,age,job 이므로.
		System.out.println(parent.name+ " 님은 " + parent.age + "살이고, 직업은 "+ parent.job);
		
//		Child는 GarandParent 타입이고 가지고 있는 참조는 Child 타입이다. 
		GrandParent child = new Child("홍길동",20,"산적");  //상위형변환.
		System.out.println(child.name+ " 님은 " + child.age + "살이고, 직업은 "+ child.job);
		
//		상위타입 > 하위타입  하위형 변환
//		하위형 변환이 되려면 한번은 상위형변환이 일어났어야함
//		parent2 : Parent타입, 가지고 있는 참조는 Parent
//		parent : GrandParent타입, 가지고 있는 참조는 Parent (상위형변환에 의해서 Parent 참조를 가지게 됨)
		
		Parent parent2 = (Parent)parent; //형변환연산자 ( ) , 상위형변환 경험ㅇ 
		System.out.println(parent2.name+ " 님은 " + parent2.age + "살이고, 직업은 "+ parent2.job);

//		child2 : Child 타입, 가지고 있는 참조는 Child
//		child  : Grandparent타입, 가지고 있는 참조는 Child. (상위형변환에 의해서 Child 참조를 가지게 됨)
		Child child2 = (Child)child;
		System.out.println(child2.name+ " 님은 " + child2.age + "살이고, 직업은 "+ child2.job);
		
		
//		Overriding (오버라이딩 = 메소드 재정의 )
		
		GrandParent gp1 = new GrandParent("강할범",90,"장군");
		Parent p1 = new Parent("강아범",50,"장군");
		Child c1 = new Child("강감찬",30,"장군");
		gp1.say();
		p1.say();
		c1.say();
		
		//오버라이딩을 하는 이유
		//상위타입으로 하위타입의 기능을 수행할 수 있도록 상위형 변환을 수행한 것
		//각각의 하위타입들을 상위타입으로 호출하면.... 각각의 하위타입들을 알 필요가 없다. 
		//하위타입의 개수가 아무리 많아도 상위타입으로 호출을 일원화 시킬수 있다. **************
		GrandParent gp2 = p1;  //자동
		GrandParent gp3 = c1;  //자동
		Parent p2 = c1;
		gp2.say();
		gp3.say();
		p2.say();
		
		
		
		
		
	} //main
	
} //class





