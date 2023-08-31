
public class CalExample {

	
	public static void main(String args []) {
		
		
	// 1. 기본 대입
		
	int x = 10;
	int y = 2;
	
	// 2. 산술 연산 (+,-,x,/,%)
	int result = 0;
	
	result = x + y;
	System.out.println("x + y = " + result);
	
	
	result = x - y; 
	System.out.println("x - y = " + result);

	
	result = x * y;
	System.out.println("x * y = " + result);
	
	result = x / y;
	System.out.println("x / y = " + result);
	
	result = x % y; // 나머지 연산
	System.out.println("x % y = " + result);
	
	
	//대입연산자가 산술연산자랑 같이 쓰아는 경우
	int z = 10;
	// z = z + 1;  
	z += 20;
	System.out.println(z);
	z -= 20;
	System.out.println(z);
	z *= 20;
	System.out.println(z);
	z /= 20;
	System.out.println(z);
	z %= 20;
	System.out.println(z);
	
	
	int YY = 10;
	YY++;
	++YY;
	System.out.println(YY);
	
	int XX = 100;
	--XX;
	XX--;
	System.out.println(XX);
	
	
	int z1 = 10;
	System.out.println(z1++);
	int z2 = 2;
	System.out.println(z2);
	System.out.println(z1);
	
	
	
		
	}
	
	
}
