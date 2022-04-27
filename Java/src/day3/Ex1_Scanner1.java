package day3;

import java.util.Scanner;

public class Ex1_Scanner1 {

	public static void main(String[] args) {
		/* 한 학생의 수학, 영어, 국어 성적을 입력받고, 총점과 평균을 구하세요
		 *  단 , 성적은 정수로 입력받고 0 ~ 100 사이의 정수를 입력해야 합니다.
		 *		(예상 결과)
		 *  수학을 입력하세요 ( 0~100) : 90
		 *  영어을 입력하세요 ( 0~100) : 90
		 *  국어을 입력하세요 ( 0~100) : 91
		 *  세 과목의 총점은 271점입니다.
		 *  세 과목의 평균은 90.333333점 입니다.
		 *  
		 *  */		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : "); // 같은라인에 쓰기위해 줄바꿈을 안하기위해 ln 제거
		int num = scan.nextInt();
		System.out.println("입력한 정수는" + num + "입니다");
		
		
		System.out.print("국어 성적 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 성적 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 성적 입력 : ");
		int mat = scan.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot / 3.0 ; 
		
		System.out.println("총점은" + tot + "점 입니다");
		System.out.println("평균은" + avg + " 점 입니다");
		
		
		
		scan.close(); // 안써도 문제없음 노란줄이 거슬려서 씀 !
	}

}
