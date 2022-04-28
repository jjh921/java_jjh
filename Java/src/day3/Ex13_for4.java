package day3;

public class Ex13_for4 {

	public static void main(String[] args) {
		/* 1부터 5까지 합을 구하는 코드를 작성하세요.
		 * */
		int sum = 0; // 최종 합
		for(int i=1; i<=5 ; i++) { 	// int i =1로 초기화 ; i <= 5 작거나 같다 조건식 ; i ++ 증감연산 반복할때마다 1씩 증가	
			sum += i;  //( += ) = 덧셈대입 변수의 뒤의값을 더 하는것 . 
		}
		System.out.println(sum);
	}

}
