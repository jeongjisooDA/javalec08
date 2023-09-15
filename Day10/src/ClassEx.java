
// 기본적으로 자바라는 언어는
// 모두 클래스로 이루어져있습니다.
// 최소 파일 1개당 하나의 크래스가 정의되어야 한다.
// 클래스 정의 문법
// 접근제한자 + class 클래스명 {멤버...}
// 멤버의 구성요소
// 1. 필드/멤버변수/속성  ---> 클래스 전역변호/상수
// 2. 메서드 --> 클래스의 기능/행위
// 3. 생성자(메서드) --> 클래스의 객체를 생성하는 행위
// !) 위의 3개의 멤버가 꼭 정의되어야 하는 것은 아니다.



class Nvidia{
	
	String modelName;
	String modelNo;
	
	
	void echoModel() { //모델명을 말하는 놈
		System.out.println("modelName : " + modelName );
		System.out.println("modelName : " + modelNo);
	}
	
	void showMonitor() {	
	
		System.out.println("모니터야 나와라!");
		
	}
	
}


public class ClassEx {

	
	
	public static void main(String args[]) {
		
		// 1.엔비디아 객체를 생성하자.
		Nvidia video = new Nvidia();
		// 2.객체의 메서드나, 속성에 접근하고자 할 때 사용하는 연산자는 .을 붙여 호출
		
		// 3. 속성에 직접 접근
		video.modelName = "Geforce";
		video.modelNo = "3770";
		
		System.out.println(video.modelName);
		
		// 메서드 직접 호출.
		video.echoModel();
		video.showMonitor();
		
		
		
		
	}
	
	
	
}

