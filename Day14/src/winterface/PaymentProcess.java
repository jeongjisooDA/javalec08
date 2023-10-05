package winterface;

public class PaymentProcess {

	public void paygo(Paymethod p) {
		
		p.pay();
		
	}
	
	
	public static void main(String args[]) {
		PaymentProcess pp = new PaymentProcess();
		//Paymethod p = new Paymethod(); //Payment 인터페이스 new X
		//pp.paygo(p);
		Paymethod cash = new Cash(); //다형성
		Paymethod card = new Card(); //다형성
		Bank bank = new Cash(); //다형성
		
		pp.paygo(card);
		System.out.println("==================");
		pp.paygo(cash);
		System.out.println("==================");
		bank.저축();
		
		//Paymethod cash = new Cash();
		cash.pay();
		//cash.저축(); //error
		
		//타입캐스팅
		((Bank)cash).저축();
			
		//Bank bank = new Cash();
		bank.저축();
		//bank.pay(); //error
		((Paymethod)bank).pay();
		
		Cash c = new Cash();
		c.저축();
		c.pay();
		
		cash.payback(); // cash는 payback() 지원
		card.payback(); // card는 payback() 미지원 - 재정의 안함.
		
		
		//익명 구현 객체
		//Paymethod pp2 = new Paymethod();   ----> 인터페이스는 new키워드로 생성 불가하지만,  
		Paymethod pp2 = new Paymethod() { // 익명 구현 객체를 통해 가능. 

			@Override
			public void pay() {
				System.out.println("익명구현객체");
			}
		
			
		};  // 마지막에 세미콜론을 붙여야 함.
		
		pp2.pay();
		
		
		if(pp2 instanceof Paymethod) {
			
			System.out.println("pp2는 Paymethod의 자식이거나/본 체");
			
		}
		
	}
	
}
