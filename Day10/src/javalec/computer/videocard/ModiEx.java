package javalec.computer.videocard;

public class ModiEx {

	private int a = 10;
	
	public static void main(String args[]) {
		
		
		Geforce video1 = new Geforce();
		video1.defaultPrintName();
		video1.protectedPrintName();
		//video1.privatePrintName();  //private 자기 자신만 접근 가능.
		//System.out.println(a);
		
		
		Geforce video2 = new Geforce();
		Geforce video3 = new Geforce("냥냥냥");
		
		System.out.println(video2.modelName);
		System.out.println(video3.modelName);
		
		
	}
	
	
	
	
}
