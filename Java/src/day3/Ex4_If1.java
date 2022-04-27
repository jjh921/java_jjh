package day3;

import java.util.Scanner;

public class Ex4_If1 {

	public static void main(String[] args) {
		/*	두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 *  정수1을 입력하세요 : 1
		 *  정수2를 입력하세요 : 2
		 *  산술연산자를 입력하세요 : +
		 *  op이 +이면 num1 + num2를 출력하고
		 *  op이 -이면 num1 - num2를 출력하고
		 *  op이 *이면 num1 * num2를 출력하고
		 *  op이 /이면 num1 / num2를 출력하고
		 *  op이 %이면 num1 % num2를 출력하고
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1을 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("정수2를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.print("산술연산자를 입력하세요 : ");
		char op = scan.next().charAt(0);
		if(op == '+' ) {  //(조건식) 결과가 참 또는 거짓
			System.out.println(num1+num2);
		}else if (op=='-'){
			System.out.println(num1-num2);
		}else if (op=='*'){
			System.out.println(num1*num2);
		}else if (op=='/'){
			System.out.println(num1/(double)num2);
		}else if (op=='%'){
			System.out.println(num1%num2);
		}else {
			System.out.println("잘못된 접근입니다");
		}
		
		scan.close();
		
	}

}
