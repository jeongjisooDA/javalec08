package abs;

public class Tri extends Shape {

	public Tri() {
		
		this.type = "삼각형";
		
	}
	
//	@Override  ----> Final 메서드는 재정의(Override) 안됨.
//	public void 나재정의안돼() {
//		
//		
//	}

	
	
	@Override
	public void 넓이구하기() {
		this.printMyType();
		this.나재정의안돼(); //상속은 가능해서 호출은 가능.
		System.out.println("높이 : " +  x);
		System.out.println("밑변 : " +  y);
		int result = (int)(x*y*0.5f);
		System.out.println("넓이 : " + result);
	
	}
	
	
}
