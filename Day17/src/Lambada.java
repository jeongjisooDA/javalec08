

class User{
	
	String name;
	int age;
	User(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	boolean isSameUser(User user) {  // 동명이인이니?
		
		return this.name.equals(user.name);
	
	}
	
	boolean isSameUser2(User user) {  // 동명이인이니?
		
		return this.name.equals(user.name) && this.age == user.age;
	
	}
}


interface InterA {
	boolean isSameUser(User user1, User user2);
	boolean isSameUser2(User user1, User user2);
	
	}


@ // 함수형 인터페이스
interface InterB {
	boolean isSameUser(User user1, User user2);
	
//	boolean isSameUser(User user1, User user2) {
//		
//		return user1.name.equals(user2.name);
//		
//	}
	
	//boolean isSameUser2(); // 함수형 인터페이스의 추상메서드는 하나밖에 넣을 수 없다.
	
}




public class Lambada {

	public static void main(String args[]) {
		
		User user1 = new User("이종석", 10);
		User user2 = new User("이종석", 29);
		System.out.println("동명이인 ? : " + user1.isSameUser(user2)); //동명이인
		System.out.println("동명이인 + 동갑 ? : " + user1.isSameUser2(user2)); //동명이인
		
		//익명객체
		InterA func = new InterA() {

			@Override
			public boolean isSameUser1(User user1, User user2) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isSameUser2(User user1, User user2) {
				// TODO Auto-generated method stub
				return false;
			}	
			
		};
	
		System.out.println("동명이인 ? : " + user1.isSameUser(user2)); //동명이인
		System.out.println("동명이인 + 동갑 ? : " + user1.isSameUser2(user2)); //동명이인
		
		
		InterB a = (x,y) -> {
			return x.name.equals(y.name);
		};
		
		a.isSameUser(user1, user2);
		System.out.println("동명이인 ? : " + a.isSameUser(user1, user2)); //동명이인
		
		
		InterB b = (t, v) -> {
			return t.name.equals(v.name) && t.age == v.age;
		};
	
		System.out.println("동명이인 ? : " + a.isSameUser(user1, user2)); //동명이인
		System.out.println("동명동갑 ? : " + b.isSameUser(user1, user2)); //동명이인
		
		
	}	
	
	
		
	
	
}
