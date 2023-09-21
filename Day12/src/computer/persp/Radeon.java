package computer.persp;

public class Radeon extends VideoCard {

	
	@Override
	public void showMonitor(String text) {
		
		게임3D가속();
		System.out.println("졸라멋진" + text);
		
	}
	
	
	//@Overloading
	public void showMonitor() {
	
		this.showMonitor("이건 자식객체의 showMonitor");
		super.showMonitor("이건 부모객체의 showMonitor");

	}
	
	
	public void 게임3D가속() {
		
		System.out.println("Radeon 3D 가속");
		
	}
	
}
