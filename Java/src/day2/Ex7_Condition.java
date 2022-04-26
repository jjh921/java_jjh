package day2;

public class Ex7_Condition {

	public static void main(String[] args) {
		/* 조건 선택 연산자 예제
		 * (조건식) ? 참일때 값 : 거짓일 때 값
		 * 성적이 A학점이면 A학점으로 출력하고 , 아니면 A학점이 아님으로 출력하는 예제
		 * = : 오른쪽에 있는 값을 왼쪽에 저장 , 왼쪽에는 변수가 1개만 와야한다. 상수도 오면 안됨!
		   == : 같다 , 비교
		 * */
			int score = 90;
			String isA = (score >=90 && score <=100) ? "A학점" : "A학점이 아님";
			System.out.println(score + "점은 "+ isA);

	}

}
