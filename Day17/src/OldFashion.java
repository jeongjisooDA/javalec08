import java.util.Iterator;
import java.util.List;

public class OldFashion {

	
	public static void main(String args[]) {
		
		List list = List.of(1,2,3,4,5,6,7);
		
		for(Object v : list) {
			
			System.out.println(v);
			
		}
		
	
		System.out.println("iterator=======================");
	
		
		//iterator -> cusor
		Iterator it = list.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next()); //iterator는 Cusor가 존재하는데 While문을 돌리면 마지막에 멈춰있음.
			
		}
		
		
		System.out.println(it.next());  //Cusor가 마지막 차례에 있기 때문에 에러 발생.
		
		
		
		
	}
	
}
