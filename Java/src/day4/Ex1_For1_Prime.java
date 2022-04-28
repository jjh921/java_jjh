package day4;

public class Ex1_For1_Prime {

	public static void main(String[] args) {
		/*	정수가 num가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 소수는 약수가 1과 자기자신의 수 . 약수의 개수가 2개인 수 ( 자기보다 큰 수는 약수가 될 수 없음 ) 
		 * 1 : 소수가 아님 
		 * 2 : 소수. 1,2
		 * 3 : 소수. 1.3
		 * 4 : 소수가 아님. 1,2,4
		 * 	소수 : 1보다 큰 자연수 중 1과 자기 자신만의 약수를 가지는 수 
		 * 반복횟수 : int  i = 1 , i는 1부터 num까지 1씩 증가
		 * 규칙성 : i가 num의 약수 이면 (if문) 약수의 개수를 하나 증가
		 * 				num를 i로 나누었을 때 나머지가 0과 같다면 count를 1증가
		 * 
		 * 반복문 종료 후 : 약수의 개수가 2개이면 소수라고 출력하고, 아니면 소수가 아님이라고 출력
		 * 							count가 2와 같으면 소수라고 출력, 아니면 소수가 아님이라고 출력
		 * */
		int num = 135;
		int count = 0;
		//i는 1부터 num까지 1씩 증가 => 초기화, 조건식, 증감식으로 해야하는데 어떻게 해야하나요?
		//초기화는 ~부터
		//조건식은 ~까지. 초기화값이 기준값보다 작으면 <=로, 크면 >= 로
		//증감식은 증가 또는 감소
		for (int i = 1; i <= num; i++) {
			//num을 i로 나누었을 때 나머지가 0과 같다면 count를 1증가
			if (num % i == 0) {
				count ++; // 앞의 변수에 뒤의 값을 더 함
			}
		}
		// count 2와 같으면 소수라고 출력, 아니면 소수가 아님이라고 출력
		if (count == 2) { 
			System.out.println(num + "는 소수입니다");
		} else {
			System.out.println(num + "는 소수가아닙니다");
		}
	}

}