package day2;

public class Ex4_String {

	public static void main(String[] args) {
		/* 문자열 + 문자열 => 문자열
		 * 문자열 + 정수 => 문자열
		 * 문자열 + 문자 => 문자열
		 * 문자열 + 실수 => 문자열
		 * */
		String str = "Hello"; //문자열은 " " 를 쓴다 .
		str = str + " world "; // 문자열은 - 는 안됨 
		System.out.println(str);
		str = str + '!';
		System.out.println(str);
		str = str + 123 ; 
		System.out.println(str);
		str = str + 3.45;
		System.out.println(str);
		str = str + true;
		System.out.println(str);

	}

}
