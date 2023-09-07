
public class Array2Example {

	
	 public static void main(String args[]) {
		 
//		 //다차원 배열 사용
//		 
//		 //1.2차원 배열 선언
//		 int[][] matrix; 
//		 
//		 //2.2차원배열 선언과 도잇에, 데이터 공간만 만들기
//		 
//		int[][] matrix2 = new int[2][4]; //2개의 동으로 이루어져 있는 아파트 단지.
//		//2개의 동으로 이루어져 있는 아파트 단지
//		//한 동은 방 4개로 구성되어있다.
//		//= matrix 아파트단지는 총 8가구로 이루어져 있다.
//		//내 친구의 집은 1동 3호에 삽니다.
//		System.out.println(matrix2[0][2]);
//		
//		
//		//3.배열 선언과 동시에 초기화.
		int[][] matrix3 = {
				{1,2,3,4},
				{5,6,7,8}  
		}; 

		
		
		
		for(int i=0; i < matrix3.length; i++) {
			
			
			for(int i2=0; i2 < matrix3[i].length; i2++) {
			
				
				System.out.println("matrix3[][]" + matrix3[i][i2]);
				
			}
			
		}
		
		
		// 퀴즈 "matirx3["+idx1+"]["+idx2+"]" <=== 이 출력을 제외하고
		// matrix3[0][0] = 1식으로 출력하지 않고,
		// 그냥 담겨져 있는 값만 출력하는 조건으로
		// 향상된 for문으로 출력해보세요.
		// hit는 그림
		
		
		//int x1[] = {1,2,3,4};
		
		
		
		for(int[] val1 : matrix3) {
			
			for(int val2 : val1) {
				
		
			}
			
			System.out.println();
			
		}
			
			
		
		
		
	 
	 }
	
	
	
}
