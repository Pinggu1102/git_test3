package git_test3;

public class Sort {

	public static void sort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			
			int value = a[i];
			int j;
			
			for (j = i-1; j >= 0; --j) {
				
				if (a[j] > value) {
					
					a[j+1] = a[j];
					
				}else {					
					break;					
				}
				
			}//안쪽 for문			
			a[j+1] = value;
		}//바깥 for문
		
	}//sort 메소드
	
}//sort클래스
