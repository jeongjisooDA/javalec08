
public class ForExample {

	
	//for
	//for(초기화문; 조건문; 증감식)
	//실행문
	//문제가 1~10까지 숫자 중 짝수만 출력하세요.
	
	
	public static void main(String args[]) {
		
	
		for(int i = 1; i<=10; i++) {
			//초기화는 시작할 때, 한번!
			if(i % 2 == 0)
			System.out.println(i);
		 	
			}
			
			int a;
			for(a= 1; a<=10; a++) {
				if(a % 2 == 0)
				System.out.println(a);
			}
			
			int b;
			for(; b<=10; b++) {
				if(b % 2 == 0)
				System.out.println(b);
			}	
			
			
			for(;;) {   //조건식 부분이 무조건 ture 무한루프
				
			}
				
				
		}
		
		
	
	
	
	
	
	
	
		
	}
	
	
	
}
