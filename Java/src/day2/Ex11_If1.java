package day2;

public class Ex11_If1 {

	public static void main(String[] args) {
		/*
		 * num가 짝수이면 짝수라고 출력하는 코드를 if문을 이용하여 작성하세요. ~하면 ...한다 ~조건식 ... : 실행문 ; if (조건식 )
		 * { 실행문; }
		 */
		if (true) {
			System.out.println("참입니다");
		}

		int num = 0;
		if (num % 2 == 0) {
			System.out.println(num + "는 짝수");

		}
		/*
		 * score 90점이상이고, 100점이하이면 A학점이라고 출력하는 코드를 if문을 이용하여 작성하세요 if(score가 90점이상이고
		 * score가 100점이하이다){ A학점이라고 출력; }
		 * 
		 * if(score가 90점보다 크거나 같다 && score 100점보다 작거나 같다) { A학점이라고 출력; }
		 *
		 */

		int score = 95;
		if (score >= 90 && score <= 100) {
			System.out.println(score + "은 A학점");
		}
	}

}
/*조건식 1이 참이면 실행문 1을 실행해라
if(조건식1 ){
	실행문 1;
}
//조건식1이 거짓이고 조건식2가 참이면 실행문2를 실행해라
else if (조건식 2) {
	실행문2;
}
//조건식 1이 거짓이고 조건식2가 거짓이면 실행문3을 실행해라
else{
	실행문3;
}
*/