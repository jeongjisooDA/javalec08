
public class VarExamples {

	
	public static void main(String[] args) {
		
		//변수는 개발자가 쉽게 데이터에 접근하고 사용, 삭제할 수 있도록 값을 넣을 수 있는 공간입니다.
		
		//자료형(데이터 타입) 변수형 ---> 평형 집이름;
		
		
		int age; // 변수(공간)을 메모리에 할당(만듬) --->  int형 변수 age를 선언한다.
		
		age = 10; // age라는 공간에 10이라는 값을 넣는다.
		

		age = -10;
		System.out.println("변경된 나이는 " + age + "살 입니다.");
		System.out.println("나이가 " + age + "살 이라고?");
		
		
		System.out.println("나이는 "+ age +"살 입니다.");
		
		int age2 = 20;  //공간 생성과 동시에 값을 초괴화(넣는) 작업도 가능하다.
		
		System.out.println("age2의 나이는 " + age2 + "살 입니다." );
		
		
	
	}
	
}
