
import java.util.InputMismatchException;
import java.util.Scanner;


class Student {
	
	String name;
	int grade;
	Student(String name, int grade){
		
		this.name = name;
		this.grade = grade;
		
	}
	
	public String toString() {
		
		return "Stundet [name :" + this.name + ", grade :" + this.grade + "]";
		
	}	
	
}


public class ExceptionEx02 {
	
	static Student[] students = new Student[3];
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int grade = 0;
		int studentIdx = 0;
		
		
		while(true) {
		
			System.out.println("이름을 입력하세요.:");
			name = scanner.nextLine();
			
			try {
				
				System.out.println("학년을 입력해주세요.:");
				grade = Integer.parseInt(scanner.nextLine());
				students[studentIdx ++] = new Student(name,grade); //배열 길이 초과.
				
			}
			
			catch(InputMismatchException ex) {
				
				System.out.println("학년은 숫자만 입력해주세요.");
				continue;
			}
			
			catch(ArrayIndexOutOfBoundsException ex) {  //배열 범위 초과.
				
				System.out.println("방이 꽉 찼습니다.");
				break;
				
			}
			
			catch(Exception ex) {
			
				System.out.println("알 수 없는 예외가 발생하였습니다.");
				continue;
				
			}
			
			System.out.println((studentIdx) + "명의 학생이 저장되었습니다.");
			//if(studentIdx == 3) break;

		}
		
		for (Student std : students) {  // 향상된 for문.
			
			System.out.println("1번째 학생 : " + std); //or System.Out.println(std.toString());
			
		}
		
	}

	
}
