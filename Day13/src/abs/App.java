package abs;

public class App {

	public static void main(String args[]) {
		
		Shape sh1 = new Tri();
		sh1.x = 10;
		sh1.y = 5;
		Shape sh2 = new Square();
		sh2.x = 20;
		sh2.y = 5;
		
		sh1.넓이구하기();
		sh2.넓이구하기();
		
		Tri sh3 = new Tri();
		//Shape sh3 = new Shape(); //안됨
		//추상클래스는 독자적으로 객체를 생성할 수 없다.
	}
	
	
	
	
}
