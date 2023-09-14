import java.util.Arrays;

public class Assignment {

	
	static int[] sliceArray(int[]x, int from) {
		//1. 복제할  temp 배열을 만들어주자.
		int[] result = new int[x.length - from];
		
		//2. 복제대상 배열변수에 인자로 넘어온 x 배열변수 값을 복제.
		//i = result의 인덱스, from은 x배열의 인덱스
		//for(a,b,c)  -> a,b,c는 따로/같이 놀 수 있다. (반드시 같이 노는건 아니다.)
		for(int i = 0; from<x.length; from++) {
			result[i++] = x[from];		
		}
		return result;
	}
	
	
	public static void main(String args[]) {
		
		int[] x = {1,2,3,4,5,6,7,8,9,10};
		int[] r = sliceArray(x,3);
		int[] a = sliceArray(r,4);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(a));
	
	}
	
}
