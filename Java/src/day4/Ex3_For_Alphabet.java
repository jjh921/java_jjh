package day4;

public class Ex3_For_Alphabet {

	public static void main(String[] args) {
		/*	반복문을 이용하여 a부터 z까지 출력하는 코드를 작성하세요
		 *
		 * a부터 z까지 a는 문자 : char  ( 한자리수는 문자 ) 
		 * 문자 i 는 a부터 z까지 하나씩 증가시킨다
		 * 실행문 : i를 하나씩 증감 시킴 
		 * 
		 * 반복횟수 : 알파벳 26자리
		 * 					i는 0부터 26보다 작을때까지 1씩증가
		 * 실행문 : (char)('a'+ i )를 출력
		 * 
		 * 반복문 종료 후 : 없음 !
		 * */ 
		for (int i = 0; i < 26; i++) {
			System.out.println((char) ('a' + i)); // (char) 을 빼면 정수가 나오는데 그 정수는 해당 문자의 유니코드 이기때문에 문자(char)을 넣어줌
		}
		/*
		 * 		반복횟수 : 26번 
		 * 						i는  'a'부터 'z' 까지 1씩 증가
		 * 		실행문 : i를 출력 
		 * 		반복문 종료 후 : 없음
		 * */
		
		//반복문을 이용하여 a부터 z까지 출력하는 코드		
		for (char j = 'a'; j <= 'z'; j++) {
			System.out.println("영문 : " + j);
		}
		int num1 = 1;
		char ch1 = 'a' + 1; //리터럴상수 1은 char 타입이어서 타입변환이 발생하지않음
	//	char ch2 = 'a' + num1; //num1의 1은 int 타입이여서 타입변환이 발생하고 , 자동타입변환이 되지 않은 상황이어서 에러가 발생
		//올바른 예 ) char ch2 = (char) ('a' +num1); 강제 타입변환 
	}

}
