class Math01 {
	
	int divide (int x, int y) throws ArithmeticException {  //호출하는 곳에 예외처리하게 만듬.
		
		if(y==0) throw new ArithmeticException("못 나눠 0으론");
		return x/y;
	
	}


}


public class ExceptionEx03 {

	public static void main(String args[]) {
		
		Math01 m = new Math01();
		int b = 0;
		try{
			b = m.divide(10, 0);
		}
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		System.out.println(b);
	}

}
