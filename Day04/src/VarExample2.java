
public class VarExample2 {

	
	
	public static void main(String args[]) {
		
		
		//변수선언 / 할당(초기화) / 사용
		// 1. 변수 선언
		// 데어터타입 변수명;
		// 2. 할당
		// 변수명 = 값;
		// 3. 사용
		// ex) System.out.println(변수명); 등등
		
		
		String name = "정지수"; //참조데이터타입 (문자열 - String)
		int age = 46; //기본데이터탑입 (정수 - int)
		
		
		age = age - 10; // age = 46-10  사용
		System.out.println("이름 : " + name + "\n나이 : " + age);
		
		final float PI = 3.14f;
		final String dontChange = "바꾸지마";
		System.out.println(PI);
		System.out.println(dontChange);
		
		System.out.println("제 이름은 "
				+ "\n"
				+ "\n"
				+ "\n"
				+ "정지수입니다.");
		
		System.out.println("나이는\tXX입니다.");
		System.out.println("제 이름은 \"정지수\" 입니다.");
		
		String message = "제 이름은 \"정지수\"입니다.";
		System.out.println(message);

		
		String message2 = "리터널은 \\로 시작합니다. (보통은)";
		System.out.println(message2);
		
		
		
	}
	
	
}
