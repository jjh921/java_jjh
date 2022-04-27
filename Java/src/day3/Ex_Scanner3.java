package day3;

import java.util.Scanner;

public class Ex_Scanner3 {

	public static void main(String[] args) {
		/*	두 정수와 산술 연산자를 입력받아 출력하는 코드를 작성하세요.
		 *
		 * 방법1.
		 * 정수1을 입력하세요 : 1
		 * 정수2를 입력하세요 : 2
		 * 산술 연산자를 입력하세요 : +
		 * 1+2
		 * 
		 * 방법2.
		 * 두 정수와 산술 연산자를 입력하세요 ( 예 : 1+2) : 1+2
		 * 1+2 
		 * */
		// 방법1.
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1을 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("입력한 정수는 "+num1+"입니다");
		System.out.print("정수2를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println("입력한 정수는 "+num2+"입니다");
		System.out.print("입력한 연산자는 : ");
		char op = scan.next().charAt(0);
		System.out.println("입력한 연산자는 "+ op + "입니다");
		//정수 + 정수 => 정수   + (유니코드 43)
		// +는 유니코드표에서 십진수 43에서 해당
		//문자열 + 정수 => 문자열
		int num = num1+num2;
		
		System.out.println("" +  num1 + op + num2 + "=" + num);  // "" 유니코드표를 문자열로 바꿔주기 위함 
		System.out.println("정수의 합은"+(num1+num2)+"입니다" );
		System.out.println("정수의 합은"+(num1-num2)+"입니다" );
		System.out.println("정수의 합은"+(num1/(double)num2)+"입니다" ); //소수점이 나오기 위해 실수형 강제타입변환
		System.out.println("정수의 합은"+(num1%num2)+"입니다" );
		
		
		//방법2
		System.out.print("정수와 산술연산자를 입력하세요 (예: 1 + 2) : ");
		int num3 = scan.nextInt();
		char op1 = scan.next().charAt(0);
		int num4 = scan.nextInt();
		System.out.println(""+num3 + op1 + num4);
		
		
		scan.close();
	}

}
