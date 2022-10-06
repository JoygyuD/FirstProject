
public class VariableExample {

	int var; // 멤버 변수 (인스턴스 변수) -> 인스턴스 내에서 사용하는 변수
	static int var2; // 멤버변수  (클래스 변수) 
	
	public static void main(String[] args) { // public = 누가든지 접근성  / static = 메소스 접근과타입 / void[리턴타입] = 리턴 반환값이 없는것 기본자료형을 넣을수있음
		// 변수(Variable)
		// - 변수는 프로그램이 실행되는 동안 어떤 값을 저장하기 위해서 사용하는 공간. 
		// - 변수는 프로그랢이 실행되는 때마다 저장되는 값이 바뀔 수 있다.
		// - 변수에는 복수 개의 값을 저장할 수 없고, 하나의 값만 저장할 수 있습니다.
		// - 변수에는 다양한 타입의 값을 저장할 수 없고, 한가진 타입의 값만 저장할 수 있다.
		
		/*
		 *  변수의 선언 방법
		 *  
		 *  <데이터 유형(Type)> <변수 식별자 이름>;
		 *  ex) int A; // int는 정수 형태의 데이터 타입
		 *  
		 *  - 같은 타입의 변수는 콤마(,) 를 사용하여 한꺼번 선안할 수 있음.
		 *  ex) int a, b, c;
		 *  
		 *  - 변수를 선언하고 처음 값을 저장할 경우 이런 값을 초기값이라고 부릅니다.
		 *    이렇게 초기값을 주는 행위를 "초기화" 라고 부릅니다.
		 *    ex) <변수 식별자 이름> = <값(literal=상수)>; 
		 *    
		 *  - 데이터 타입은 변수가 어떤 유형의 데이터인지 알려주기 위한 자료형 키워드.
		 *    기본 자료형은 정수형(byte, short, int, long), 
		 *    부동소수점형 ( float , double), 논리형 (Boolean), 문자형(char) 이 존재함.
		 *    
		 */
		
		int a; // 변수 선언(지역변수)
		a = 10;
		int b = 20;
		int c = 10, d = 20, e = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c + d + e);
		
		//System.out.println(var); 
		System.out.println(var2);
		
		//add() 처리 확인
		int result = add(b, (c+d+e));
		System.out.println("계산 결과는 : " +result+"입니다.");
		
	}
	// 메서드 형식
	// <return_type> <method-name> (parameter_list) {
	//	... ( 메서드에 실행할 논리적 구문이 존재함 )
	// }
	// return_type : 메서드 블럭 안에 코드를 실행한 다음 결과를 반환할 수 있습니다.
	//		이때에 반환하는 데이터의 타입을 알려주는 것이 바로 return_type 입니다.
	// parameter_list : 외부로부터 값을 전달 받는데 사용함. 메서드가 실행하기 위해서
	// 			외부에서 전달받아야 할 목록을 기록!. 이때에 데이터의 유형과 변수 이름을 함께
	//			기록합니다.
	static int add(int num1, int num2) {
		return num1 + num2; // float , doulbe 실수형
	}
}
