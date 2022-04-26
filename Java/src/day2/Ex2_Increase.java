package day2;

public class Ex2_Increase {

	public static void main(String[] args) {
		/* 증감 연산자 : 최종적으로 1증가 또는 1감소
		 * 전위형 : ++변수명 , 증가 후에 동작
		 * 후위형 : 변수명++ , 동작 후 증가
		 */
		int num1 =10,  num2 =10;
		//num1 : 전위형 , num2 : 후위형
		System.out.println(num1 + " , " + num2);
		System.out.println(++num1 + " , " + num2++);  //전위형 증감연사자이기에 num1 은 1이 증가된값으로 나오고 num2 는 후위형 증감자 이기에 초기값이 변화가 없음
		System.out.println(num1 + " , " + num2); 
		
		int num3 =10,  num4 =10;
		//num3 : 전위형 , num4 : 후위형
		System.out.println(num3 + " , " + num4);
		++num3;												//전위형 num3 +1이 증가된값이 나옴 
		System.out.println(num3 + " , " + num4); 
		++num4;												//전위형 num4 + 1이 증가된값이 나옴
		System.out.println(num3 + " , " + num4);  //전위형 num3 , num4 각자 1의 값이 올랐기 때문에 11,11이 나옵니다.
	}

}
