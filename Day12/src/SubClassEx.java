/*
 * SubClassEx라는 클래스는 SuperClassEx를 상속받는 자식 클래스입니다.
 * A가 B를 상속받는다.
 * A extends b
 */

public class SubClassEx extends SuperClassEx {
//SubClassEx의 부모클래스는 SuperClassEx
	 
	//아버지한테 없는 특성을 자식에게 넣고 싶다.
	
	
	String className = "자식클래스의 className";
	String smartPhone = "갤럭시";
	
	public SubClassEx() {
		super("하악하악2");
		System.out.println("SubClassEx 생성");
		
	}
	
	
	public void printMySmartPhone() {
		
		System.out.println(smartPhone);
		
	}
	
	
	public void printMyClassName() {
		System.out.println(this.className);
		System.out.println(super.className);
		
		
		//외부 객체에서 Application01에 있는 className static
		//속성을 접근할때
		//대상클래스Name.멤버변수 = 값
		//대상클래스Nmae.method();
		Application01.className2 = "하악하악33";
		
	}
	
	
}
