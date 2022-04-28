package day4;

public class Ex4_Break1 {

	public static void main(String[] args) {
		/*	
		 * 
		 * */
		for(int i = 1; i<=5; i++) {
			System.out.println("Hello");
			if( i ==3 ) {
				break; //만나면 바로 빠져나가는 역할 (특정상황에서 빠져나갈때)
			}
		}
	}

}
