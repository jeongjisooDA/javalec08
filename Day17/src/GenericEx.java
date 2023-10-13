import java.util.HashMap;
import java.util.List;
import java.util.Map;


class A {
	
	
}

class GenericClass<T> extends A {
	
	private T data;
	
	public T getData() {
		
		return data;
		
	}
	
	public void setData(T data) {
		
		this.data = data;
		
	}
	
	public void getClassInfo() {
		
		System.out.println(String.format("class info : %s", data.getClass()));
		
	}
	
	
}


public class GenericEx {

	public static void main(String atgs[]) {
		
		GenericClass<Integer> cls = new GenericClass();
		GenericClass<String> cls2 = new GenericClass<String>();
		
		cls.setData(1);
		cls.getClassInfo();
		cls2.setData("정지수");
		cls2.getClassInfo();
		
		Number a = new Integer(1); //공변성
		GenericClass b = (GenericClass) new A(); //반공변성
		//불공변성은 둘다 안되는거
		
		A c = new GenericClass(); // A <- G
		//List<Object> d = new List<Integer>();
		
		
		//Map<?> map = new HashMap<String>();
		
		
	}
	
	
	static int add(List<?extends Number> list) {
		int result = 0;
		for(Number v : list) {
			
			result += Integer.parseUnsignedInt(v.toString());
			
		}
		
		return result;
		
	}
	
	
	
	
	
}
