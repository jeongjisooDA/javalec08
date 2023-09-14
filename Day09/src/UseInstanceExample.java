
public class UseInstanceExample {

	public static void main(String args[]) {
		
		//앗 난 원주율을 구하고 싶어요.
		//반지름은 5
		
		CalClassExample cal = new CalClassExample();
		CalClassExample cal2 = new CalClassExample();
		
		cal.printMyName();
		float result = cal.원주율(4);
		System.out.println(result);
		
		cal2.printMyName();
		result = cal.원주율(10);
		System.out.println(result);
		
		
		System.out.println(cal == cal2);
		
	
		System.out.println("정지수");
		int a = 10;
		//a.
		int[] b = {1,2,3}; 
		//b.
		
	}
	
	
}
