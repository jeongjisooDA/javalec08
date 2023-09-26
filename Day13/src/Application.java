
public class Application {

	//이동하다라는 행위가 있고, 수단은 인자로(탈것)
	public void 이동하다(Vehicle vh) {
		
		
		vh.moveForward();
		vh.moveBackward();
		((Car)vh).뽐내기();
		
	}
	
	public void 이동하다(CarMidoutExtend vh) {
		
		
		vh.moveForward();
		vh.moveBackward();
		
		
	}
	
	
	
	public static void main(String args[]) {
		
		Application ap = new Application();
		//Vehicle vh = new Vehicle();
		//Vehicle vh = new Car();
		//ap.이동하다(vh);
		//ap.이동하다(vh);
		//CarMidoutExtend cw = new CarMidoutExtend();
		//ap.이동하다(cw);
		Vehicle vh = new Bus();
		ap.이동하다(vh);
	
	} 
	
}
