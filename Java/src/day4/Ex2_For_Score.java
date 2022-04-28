package day4;

import java.util.Scanner;

public class Ex2_For_Score {

	public static void main(String[] args) {
		/* 3명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성하세요.
		 * 반복문 이용
		 * 단 , 총점과 평균만 알면 됨.  총점 : sum 평균 : avg
		 * 
		 *	반복횟수 : 3번 
		 *	i는 1부터 3까지 1씩 증가
		 *	규칙성 : 성적을 입력받고 총점에 누적
		 *	Scanner을 이용하여 정수를 입력받아 num에 저장한 후 ,
		 *	sum에 num을 더해서 sum에 저장
		 *	반복문 종료 후 : 총점을 출력하고 , 총점을 이용하여 평균을 계산 한 후 , 총점을 출력
		 *	sum을 출력하고 , sum을 3으로 나누어서 avg에 저장한 후 , avg를 출력
		 * */
		int sum = 0;
		double avg =0;
		Scanner scan = new Scanner(System.in);
		for(int i = 1;i <=3 ; i++ ) { // i는 1부터 3까지 1씩 증가
			System.out.print(i+"번 학생 점수 입력 : "); // 1번부터 3번 i학생의 점수를 입력
			int num =scan.nextInt(); // 점수를 입력받기 
			sum = sum+num; //총점 구하기 sum에 sum + sum 더 한 총점을 구해서 sum에 대입하기
		}
		 avg=sum / 3.0; // 평균 구하기 학생  세명의 총점을 3.0으로 나눠서 평균값 구함
		 System.out.println("세 학생의 총점은 : "+sum); //sum은 총점
		 System.out.println("세 학생의 평균은 : "+avg); // avg는 평균
		 
		
		scan.close();
	}
	
}
