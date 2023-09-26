package abs;

public abstract class Shape {

	int x;
	int y;
	
	String type;
	
	public void printMyType() {
				
		System.out.println(type);
		
	}

	
	public final void 나재정의안돼() { //final 메서드는 상속은 가능, 재정의(Override)는 불가.
		
		System.out.println("하악하악");
	}
	
	
	public abstract void 넓이구하기();
	
}
