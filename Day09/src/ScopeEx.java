
public class ScopeEx {

	static String name = "하악하악"; //전역변수

	public static void printName() {
		
		
		System.out.println(name);
	} //printName 메서드 정의부 끝
	
	
	public static void main(String args[]) {
			
		String name = "정지수"; //지역변수
		printName();
		
		int i = 0;
		for(i=0; i<10; i++) {
			
			
			
		}
		
		System.out.println(i);
		
		
	} // main 메서드 정의부 끝
	
	
} //클래스 정의부 끝
