package computer.persp;

public class Geforce extends VideoCard {
	
	@Override
	public void showMonitor(String text) {
		
		this.directX지원();
		super.showMonitor("나는 Geforce" + text);
	
	}

	public void directX지원() {
		
		System.out.println("나는 directX를 지원하지");
		
	}
	
	
}
