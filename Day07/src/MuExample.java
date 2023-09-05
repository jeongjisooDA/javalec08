
public class MuExample {

	
	//중첩문 for문
	
	
	public static void main(String args[]) {
		
		//x*y = (x*y)
		
		
		System.out.println("## 구구단 ##");
		for(int x = 2; x < 10; x++) {		
			for (int y = 1; y<10; y++) {
				//System.out.println(x + "x" + y + "=" + (x*y));
				System.out.print(x + "x" + y + "=" + (x*y) + "\t");
							
				//print();  ----> 엔터 없음
				//println(); ----> 엔터 있음
			}
			
			System.out.print("\n");
		}			
		
		
		
		
		System.out.println("## 구구단 ##");
		for(int y = 1; y < 10; y++) {		
			for (int x = 2; x<10; x++) {
				//System.out.println(x + "x" + y + "=" + (x*y));
				System.out.print(x + "x" + y + "=" + (x*y) + "\t");
							
				//print();  ----> 엔터 없음
				//println(); ----> 엔터 있음
			}
			
			System.out.print("\n");
		}	
		
		
		System.out.println("## 구구단 ##");
		for(int x = 1; x < 10; x++) {		
			for (int y = 2; y<10; y++) {
				//System.out.println(x + "x" + y + "=" + (x*y));
				System.out.print(y + "x" + x + "=" + (y*x) + "\t");
							
				//print();  ----> 엔터 없음
				//println(); ----> 엔터 있음
			}
			
			System.out.print("\n");
		}			
		
	}
	
	
	
	
	
	
	
	
	
	
}
