package diamond;

public class IntClass implements intA, intB { //같은 메서드명을 가진 인터페이스 다중 상속시

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		intA.super.printName(); // intA 메서드의 printName 호출하거나
		intB.super.printName(); // intB 메서드의 printName 호출하거나 
		System.out.println("하악하악"); //재정의 하거나
	} 
	
	

}
