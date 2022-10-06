
public class Custommer {

	public static void main(String[] args) {
	// ; (세미콜론), {}(블록), 과 공백을 사용...
		// =  가독성을 높여줌.. 
		
		// ";"(세미콜론) 은 논리적인 한 문장이 끝날 때 반드시 붙여준다.
		
		// "블록( {} ) 은 중괄호 묶은 부분을 말하고, *복합문을 구성하는 요소입니다. (*복합문이란 종속문장들이 다수개 일때 사용함)

		/* 공백은 빈칸, 탭, 빈 줄 등이 있고, 이런 공백은 소스코드를 보기 좋게 하고, 알아보기
		 * 쉽게 하는데 사용함. 즉, 프로그램 구조화 형태로 표현하는데 유용합니다.
		 */
		
		while(true) {
			System.out.println("출력 , 수정 또는 사람의 이름을 입력해주세요");
			System.out.println("또는 메뉴로 돌아가고 싶으면 q를 눌러주세요");
			String name = "q";
				if (name.contentEquals("q")) {
					System.out.println("끝입니다.");
					break;
			}
		}
        System.out.println("입력데이터를 확인했습니다.");
	}

}
