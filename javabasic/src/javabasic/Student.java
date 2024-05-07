package javabasic;

public class Student {

	private int cno; // 반
	private int sno; // 학생번호
	private String sName;// 학생명
	private int kor; // 국어점수
	private int eng; //
	private int math; //
	private int total; //

	public Student(int cno, int sno, String sName, int kor, int eng, int math, int total) {
		super();
		this.cno = cno;
		this.sno = sno;
		this.sName = sName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}


	@Override
	public String toString() {
		return "학생성적 [반번호 = " + cno + " 학생번호 = " + sno + " 학생명 = " + sName + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + ", total=" + getTotal() + "]";
	}

}
