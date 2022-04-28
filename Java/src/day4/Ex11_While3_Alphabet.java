package day4;

public class Ex11_While3_Alphabet {

	public static void main(String[] args) {
		/*	a에서 z까지 출력하는 코드를 while문으로 작성하세요
		 * */
		char ch = 'a';  //1.초기화
		while( ch <= 'z') { //2. 조건식
			System.out.print(ch); //3. 실행문
			ch++;  //4. 증감식 
		}
		System.out.println();
		//변형
		char i = 'a';  //1.초기화
		while( i <= 'z') { //2. 조건식
			System.out.print(i++); //3. 실행문  //4. 증감식 
		}
	}

}
