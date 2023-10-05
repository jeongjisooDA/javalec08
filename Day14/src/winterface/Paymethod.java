package winterface;


//접근제한자 + interface + 인터페이스명
public interface Paymethod {
	
	public abstract void pay(); //추상메소드 (abstract 생략 가능)
	//void payback(); //추상메서드   ---> 중간에 추가된 경우 하위 구현 클래스는 오류
	default void payback() { //하위호환성을 보장.
		
		System.out.println("환불");
		
	} 
	
	
}
