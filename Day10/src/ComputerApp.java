import javalec.computer.videocard.Geforce;
import javalec.computer.videocard.Radeon;
import javalec.computer.videocard.*;

public class ComputerApp {

	
	public static void main(String args[]) {
		
		//다른 풀더에 있는 Gforce와 Radeon을 생성해서 행동 삽입.
		
//		javelec.computer.videocard.Geforce video 1 = new javelec.computer.videocard.Geforce video();
//		
//		video1.turnOnMonitor();
		
		
		Geforce video1 = new Geforce();
		
		video1.turnOnMonitor();
		
		Radeon video2 = new Radeon();
		
		video2.turnOnMonitor();
		
		
		//video1.deGeforce
		
		
		
	}	
}
