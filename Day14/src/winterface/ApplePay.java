package winterface;

public class ApplePay implements Paymethod {

	@Override
	public void pay() {
		
		System.out.println("애플페이");

	}

}


class 쌀 implements Paymethod {

	@Override
	public void pay() {
		System.out.println("쌀로 결제가 돼?");
		
	}
	
}