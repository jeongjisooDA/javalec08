
//JVM --> Application01.main();


public class Application01 {

	String className; //Application01 멤버변수 //객체 참조 변수

	static String className2; //Application01 멤버(변수) //static 영역
	
	
	public void nonStaticMethod() {
		
		className = "하악 non Static";
		className2 = "하악";
		
	}
	
	
	public static void main(String args[]) {
		
		
		className2 = "내 이름은 className2";
		//this.className = "내 이름은 className2";
		
		Application01 a01 = new Application01();
		a01.className2 = "하악";	
		
	
		// 1. SuperClassEx
		SuperClassEx ex1 = new SuperClassEx();
		ex1.printClassName();
		//ex1.printSmartPhone();  //자식한테 있는 메서드
		
		System.out.println("================");
		// 2. SubClassEx (extends SuperClassEx)
		SubClassEx ex2 = new SubClassEx();
		//ex2.className = "하악하악"; //아버지한테 상속받은 속성(멤버변수)
		ex2.printClassName(); //아버지한테 상속받은 메서드
		ex2.printMySmartPhone(); //자식한테만 있는 메서드
		ex2.printMyClassName(); //자식의 className 출력.	
		
	}
	
	
}
