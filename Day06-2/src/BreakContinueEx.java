

import java.util.Scanner;


public class BreakContinueEx {

	
	public static void main(String args[]) {
		
		
		// 코드상 break를 쓰는 것이 연산 반복 횟수를 줄여줍니다.
		
		
		int command = 0;
		for(;;) {  //무한루프
			System.out.print("숫자를 입력하세요(프로그램 종료는 마이너스 값 입력.) : ");
			Scanner in = new Scanner(System.in);
			command = in.nextInt();
			if(command < 0){
				
				break;
				
			}
			
			System.out.println("입력값은 " + command + "입니다.");
		}

		System.out.println("프로그램 종료");
		
	}
	
	
	
}
