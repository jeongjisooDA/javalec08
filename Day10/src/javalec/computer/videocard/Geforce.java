package javalec.computer.videocard;


// 접근제한자
// public > protectde > default > private
// 접은을 제한고자 하는 곳은 어디인가?
// 클래스. 클래스 멤버는 모두 접근제한자를 둘 수 있다.
// 1. 클래스
// 2. 속성(멤버변수)
// 3. 메서드(멤버메서드)
// 4. 생성자(메서드) <--- 붙을 순 있지만, 주로 public



public class Geforce {
	
	public String modelName;
	private int price;
	
	
	public void showModel() {
		
		System.out.println("Radeon");
	
	}
	
	public void turnOnMonitor() {
		
		System.out.println("모니터 켜!");
	
	}
	
	//default 메서드
	void defaultPrintName() {
		
		System.out.println("디폴트 메서드야");
		
		
	}
	
	protected void protectedPrintName() {
		
		System.out.println("난 프로텍티드야");
		
	}
	
	private void privatePrintName() {
		
		
		System.out.println("난 private");
		
	} 
	
	
	//생성자(메서드)
	//1. 리턴타입 없음
	//2. 클래스명과 생성자(메서드명) 동일.
	public Geforce() {
		modelName = "하악하악";
		price = 1000;
		
	}
	
	public Geforce(String model) {
		modelName = model;
		
	}
	
	
	
	
}
