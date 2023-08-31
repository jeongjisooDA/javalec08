
public class CalExample2 {

	
	public static void main(String args[]) {
		
		
		// 1. and 연산 양쪽 모두 다 TRUE여야지 TRUE, 그 외에는 false
		System.out.println("true && true = " + (true && true));
		
		int a = 10;
		int b = 20;
		boolean result = a > 5 && b < 21;
		
		
		// 2. OR 연산 양쪽 피연산자 중 하나만 true면 true.
		result = a > 5 || b < 21 || (a + 10 < 0);
		
		
		// 3. XOR 연산자는 양쪽 중에 한쪽만 TRUE일 때, true.
		result = a > 5 ^ b < 21 ^ (a + 10 < 0);
	
		
		
		result = !result;
		
		
		
		System.out.println(result);
		
		
		int x = 100;
		int y = 110;
		boolean z = x > y && ++x == 101;
		
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		
		// &&는 선 피연산자가 false일 경우, 후 피연산자를 계산할 필요도 없이 flase이기 때문에 연산을 수행하지 않아 위의 경우 x = 100
		// ||는 선 피연산자가 true일 경우, 후 피연산자를 계산할 필요도 없이 true이기 때문에 연산을 수행하지 않아 위의 경우 x = 100
		
		
		
		
	}
	
	
}
