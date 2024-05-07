/*예외처리 실ㅇ습
*
*보험사고 발생시에 사고별 대응 프로그램
*1. 사고유형 : 정면충돌, 후면충돌, 접촉사고
*2. 정면충돌 사고시 경찰서와 119  구급대에 연락
*3. 후면충돌 사고시 보험직원 파견
*4. 접촉사고시에는 보험가입자와 전화상담.
*
*예외처리를 통해서 구현
*정면충돌사고:후면충돌사고:접촉사고비율 1:3:6
*math random 1~10 1:정면, 2~4:후면,5~10:접촉
*
*뻉소니 경찰서에 대리전화 : 11 값, 
*/

package javabasic;

public class ExceptionExer2 {

	public static final String FRONT_ACC = "정면추돌";
	public static final String BACK_ACC = "후면충돌";
	public static final String CONT_ACC = "접촉사고";
	public static final String MISS_ACC = "뺑소니사고";

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int ran = (int) (Math.random() * 11 + 1);

			try {

				if (ran == 1) {
					throw new FrontException();

				} else if (2 >= ran && ran <= 4) {
					throw new BackException();
				} else if (ran > 4 && ran <= 10) {
					throw new ContException();
				} else {
					throw new MissException();

				}
			} catch (Exception ex) {
				String msg = "";
				if (ex instanceof FrontException ) {
					msg = "정면 충돌 처리완료";
				}
				if (ex instanceof BackException ) {
					msg = "후면 충돌 처리완료";
				}
				if (ex instanceof ContException ) {
					msg = "접촉사고 처리완료";
				}
				if (ex instanceof MissException ) {
					msg = "뺑소니 처리완료";
				}
				System.out.println(ex.getMessage() + msg);

			}

		} // main

	}

}// class
