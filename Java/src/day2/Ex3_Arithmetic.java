package day2;

public class Ex3_Arithmetic {

	public static void main(String[] args) {
		/*	산술 연사자 주의 사항 : 나누기할 때 소수점 사라지는 현상 조심
		 * 
		 * 정수 연산자 정수 => 정수 
		 * 5 + 2 = 7 
		 * 5 - 2 = 3
		 * 5 * 2 = 10
		 * 5 % 2 = 1
		 * 5 / 2 = 2 (2.5가 아니라 2 정수이기 때문)
		 * 정수 연산자 실수 => 실수 
		 * 실수 연산자 실수 => 실수 
		 * 결과값이 어떤 수 
		 * */
		System.out.println(5 + 2 );
		System.out.println(5 - 2 );
		System.out.println(5 * 2 );
		System.out.println(5 % 2 );
		System.out.println(5 / 2 ); //답이 2.5가 아니라 2가 나오는 경우는 정수 이기 때문
		System.out.println(5 / 2.0 ); // 타입변환이 이루어졌기때문에 정답이 2.5로 나옴.
		System.out.println(5 / (double)2 ); //더블형으로 강제타입변환 했기때문
		
		//산술 연산자 주의사항 : 0으로 나눈 경우 예외가 발생할 수 있다. (정수 / 0 인경우, 정수 %인 경우 ) (실수 / 0인 경우는 무한대로 나누어짐)
		System.out.println(5 / 0.0);
		//System.out.println(5 / 0 );
		System.out.println(5 % 0.0);
		System.out.println("프로그램 종료");
	}

}
