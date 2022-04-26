package day2;

public class Ex15_Test3 {

	public static void main(String[] args) {
		/*		month가 주어질 때 해당 달의 마지막 일을 출력하는 코드를 if문으로 작성하세요
		 * 		31일 : 1 3 5 7 8 10 12
		 * 		30 : 4 6 9 11
		 * 		28 : 2
		 * 		그 외의 달은 잘못된 월입니다.
		 * 		month가 1이거나 month가 3이거나 month 5이거나 month가 7이거나 month가 8이거나 month 10이거나
		 * 		month가 12이면 31일이라고 출력하고
		 * 		month가 4이거나 month가 6이거나 month가 9이거나 month가 11이면 30일이라고 출력하고
		 * 		month가 2이면 28일이라고 출력하고
		 * 		아니면 잘못된 월입니다라고 출력
		 * */
		int month =12;
		if(month < 1 || month >12) {
			System.out.println(month + "월은 잘못된 월입니다");
		}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ||month == 12) {
			System.out.println(month + "월 마지막날은 31일입니다");
			
		}else if (month == 4 ||month == 6 ||month == 9 ||month == 11 ) {
			System.out.println(month +"월 마지막날은 30일 입니다.");
		}else {
			System.out.println("월 마지막날은 28일 입니다");
		}

	}

}
