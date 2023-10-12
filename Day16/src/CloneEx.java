import java.io.Serializable;

class Member implements Cloneable { //Serializable  //extents Object
	
	String name;
	Member(String name){
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println(String.format("Hello,%s", name));
		
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException {
		
		return super.clone();
		
	}
	
	
	@Override
	public String toString() {
		
		return String.format("name %s @ %s", this.name, this.hashCode());
		
	}
	
	@Override
	public boolean equals(Object m) {
		
		return this.name.equals(((Member)m).name);  // 이해 안감.
		
	}
	
	
}



public class CloneEx {

	public static void main(String[] args) throws Exception {
		
		Member member = new Member("이종석");
		Member member2 = member; //얕은 복사
		Member member3 = (Member)member.clone(); //깊은 복사
		int[] a = {1,2,3};
		int[] b = a; //얕은 복사
		int[] c = a.clone(); //깊은 복사
		
		System.out.println(member);
		System.out.println(member2);
		
		System.out.println("=================================");
		
		member2.name = "하악하악";
		System.out.println(member);
		System.out.println(member2);
		System.out.println(member3);
		
		System.out.println("=================================");
		
		member2.name = "어렵다어려워";
		System.out.println(member);
		System.out.println(member2);
		System.out.println(member3);
		
		System.out.println("=================================");

		// eqauls (객체 주소를 비교하는 함수)
		Member m1 = new Member("이종석");
		Member m2 = new Member("이종석");
		System.out.println("m1 == m2 = " + (m1 == m2));
		System.out.println("m1.equals(m2) = " + (m1.equals(m2)));
		
		
		
		
		
	}

}
