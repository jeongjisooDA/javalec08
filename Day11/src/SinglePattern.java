
public class SinglePattern {

	int sharedData = 0;  // 객체 멤버변수
	
	private static SinglePattern sp = null; // static 객체 참조 변수
	
	
	
	public void printSharedData() { // 객체 멤버 메서드

		System.out.println(++sharedData);
		
	}
	
	public static SinglePattern getInstance() {  // 싱글턴 패턴으로 객체 생성.
		
		if(sp == null) { 
			
			sp = new SinglePattern();

		}

		return sp;
		
	}
	
}
