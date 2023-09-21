import computer.persp.*;


public class computer {
	
	
	public void 비디오카드달기(Radeon rd) {
		
		rd.showMonitor("화면이 나와요.");
		
	}
	
	
	public void 범용비디오카드달기(VideoCard vd) {
		
		vd.showMonitor("화면이 나와요");
	}
	
	
	public static void main(String args[]) {
		
		Radeon rd = new Radeon();
		rd.showMonitor("화면을 출력해주세요."); //오버라이딩된 자식 메서드 호출
		rd.showMonitor(); //오버로딩된 자식 메서드를 호출하는데, 그 내용이 this.showMonitor(String), super.showMonitor(String);
	
		
		VideoCard video = new Radeon();
		VideoCard video2 = new Geforce();
	
		
		video.showMonitor("123");
		
		
		//1.객체생성
		
		computer com = new computer();
		com.비디오카드달기(new Radeon()); //OK
		//com.비디오카드달기(new Geforce()); //에러
		
		com.범용비디오카드달기(new Radeon());
		com.범용비디오카드달기(new Geforce());
	}
	
	
	
	
}
