package day4;

public class Ex10_While_Sum {

	public static void main(String[] args) {
		/*	1부터 5까지의 합을 구하는 코드를 while문을 이용하여 작성하세요
		 * 	반복횟수 : i는 1부터 5까지 1씩증가
		 * 	규칙성 : sum에 i를 더한 후 sum에 저장
		 * 	반복문 종료 후 : sum에 출력
		 * */
		
		int sum = 0;
		int i = 0;
		while(i<=5) {
			sum = sum + i;
			i++;
		}
		System.out.println("합계 : "+sum);
	}

}
