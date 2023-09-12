
public class MethodEx {

	
	/*
	//메서드는 크게 두가지 타입이 있습니다.
	// 1. 인자
	- 인자가 없는 메서드
	- 인자가 있는 메서드
	// 2. 값 돌려주기(return)
	- 값을 돌려주는 메서드
	- 값을 돌려주지 않는 메서드

	*/
	
	//1. 리턴이 없고, 인자도 없는 메서드
	
	static void printName() {
		System.out.println("나의 이름은?");
	}
	
	//2. 리턴이 없고, 인자는 있는 메서드
	static void printUrName(String urName, int urAge) {	
		System.out.println("너의 이름은 " + urName + "(" + urAge + ")");
	}
	
	//3. 리턴이 있고, 인자는 있는 메서드
	static String returnName(){
		
		return "정지수";	
	} 
	
	//4. 리턴이 있고, 인자도 있는 메서드
	static int add(int x, int y) {
		
		return x+y;	
	}
	
	
	public static void main(String args[]) {
		//메서드 이름은 : main
		//인자(매개변수) : String args[] 배열
		//돌려주는 값(return)의 데이트 타입은 void
		//void의 뜻은 "아무것도 돌려주지 않는다."
		
		
		//1. 리턴이 없고, 인자가 없는 메서드
		printName();
		printName();
		
		//2. 리턴이 없고, 인자는 있는 메서드
		printUrName("정지수",23);
		printUrName("정지수",27);
		
		//3. 리턴이 있고, 인자가 없는 메서드
		String name = returnName();
		System.out.println(name);
		String name2 = returnName();
		System.out.println(name2);
		
		
		//4. 리턴이 있고, 인자도 있는 메서드
		int result = add(1,100);			
		System.out.println(result);
		System.out.println(add(100,-100));
		
	}
	
	
	
}
