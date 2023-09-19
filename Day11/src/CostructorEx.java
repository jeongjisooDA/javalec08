
//생성자 메서드 오버로딩
//메서드 오버로딩과 똑같음(인자의 수, 인자의 데이터 타입)


class Student {
	
	String name; //학생 이름
	int grade; //학생 학년
	
	public Student() {
		
		this("홍길동");
		
	} 
	
	public Student(String stdName) {
	
		this(stdName,1);
		//	name = stdName;
		//	grade = 1;

	}
	
	public Student(String name, int grade) {
		
		this.name = name;
		this.grade = grade;
	}
	
	
	//매개변수의 데이터타입이 달라도 오버로딩은 가능.
	public Student(int grade, String name) {
		
		this.name = name;
		this.grade = grade;
		
	}
	
	public void printMe() {
		System.out.println("내이름은 " +name + " " + grade + "학년입니다.");
	}
}



public class CostructorEx {

	
	public static void main(String args[]) {
		
		Student std1 = new Student(); // 기본생성자.
		Student std2 = new Student("하악이"); //인자 1개
		Student std3 = new Student("하악하악",6); //인자 2개
		Student std4 = new Student(7,"하악하악2"); //인자 2개
		
		std1.printMe();
		std2.printMe();
		std3.printMe();
		std4.printMe();
		
	}
	
	
}
