
public class SuperClassEx {

	String className;
	
	public SuperClassEx() {
		
		System.out.println("SuperClassEx 생성");
		this.className = "아빠클래스입니다.";
		
	}
	
	
	public SuperClassEx(String className) {
		
		System.out.println("S클래스 인자있는 생성자 호호");
		this.className = className;
		
	}
	
	public void printClassName() {
		
		System.out.println(this.className);
		
	}
	
	
}
