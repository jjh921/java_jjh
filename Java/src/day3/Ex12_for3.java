package day3;

public class Ex12_for3 {

	public static void main(String[] args) {
		/* 1부터 10사이의 짝수를 출력하는 코드를 작성하세요 .
		 * */
		for( int i = 1; (i<=10);i++){
			if(i%2==0) {
				System.out.println( i );
				
			}
		}
		int a ;
		for( a=1; a<=5;  a++ ) {
			System.out.println(2*a);
			
		}
		for ( a=1 ; a<=10; a++) {
			if(a % 2 == 0 ) {
				System.out.println(a);
			}
		}
		for(a=2; a<=10; a +=2) {
			System.out.println(a);
		}
	}

}
