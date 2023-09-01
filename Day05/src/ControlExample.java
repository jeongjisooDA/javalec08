
public class ControlExample {

	
	public static void main(String args[]) {
		
		
		// 제어문 ----> 1. 조건 제어문 , 2. 반복 제어문
		// 1. 조건제어는 
		// 1-1 if
		// 1-2 switch ~ case
		
		
		int a = 0;
		if(a<0) {
			
			System.out.println("a는 음수입니다.");
		}else {
			System.out.println("a는 양수입니다.");
			
		}
		
		
		
		
		int grade = 1;
		
//		if(grade<=3) {}
//		if(grade>=5) {}
//		if(grade=4) {}
// 		그 외에는 다시 넣어주세요.
		
		
		if(grade <=3 && grade >=1) {
			System.out.println("저학년");
		} else if (grade>=5 && grade <=6) {
			System.out.println("고학년");
		} else if (grade ==4){
			System.out.println("중간학년");
		} else {
			System.out.println("입력값은 1-6까지 입니다.");
		}
		
		
		
		// switch ~ case 문
		
		int x = 3;
		switch(x) {
			case 1 :
				System.out.println("x는 1입니다.");
				break;
			case 10 :
				System.out.println("x는 10입니다.");
				break;
			case 3:
				System.out.println("x는 3입니다.");
				break;
			default :
				System.out.println("여기는 디폴트 입니다.");
		}
			
				
				
				int x1 = 3;
				if(x1 == 1); {
					System.out.println("x는 1입니다.");
				//} else if(x1 == 10) {
					System.out.println("x는 10입니다.");
				//} else if(x1 == 3)  {
					System.out.println("x는 3입니다.");
					
				//} else {
					
					System.out.println("여기는 디폴트 입니다.");
				}
			
		int max = 1 << 30;
		System.out.println(Integer.toBinaryString(max));
		
		
		//정수 최대값 최소값 구하기
		// int, byte, short 최대값, 최소값을 출력하는 프로그램을 만드세요.
		// 연산은 비트연산
		
		
		
				
		
	}
	
	
	
}
