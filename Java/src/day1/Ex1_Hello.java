package day1;

public class Ex1_Hello {
	//콘솔 응용 프로그램이 실해애되기 위해서 main이라는 얘(메소드)가 필요하다
	public static void main(String[] args) {
		/* 여러줄 주석
		 * 주석1
		 * 주석2 
		 * */
		//한줄 주석은 어느 위치에서 사용가능하지만 중간에서 사용은 안됨
		/*println(문자열) : 문자열을 콘솔에 출력한 후 줄바꿈을 합니다(엔터 효과)
		 *print(문자열) : 문자열을 콘솔에 출력 줄바꿈이 일어나지않음 (엔터 효과가 일어나지않음)
		 */
		System.out.print("Hello world!");
		System.out.println("Hello world!"); // 한줄 주석은 , 주석기호가 나온 시점부터 해당 라인 끝까지 주석처리 
		System.out.print("Hello world!");
		//실행문 끝에는 반드시 세미콜론(;)이 들어가야됨
	}

}

