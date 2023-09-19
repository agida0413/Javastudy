//1~30 30사이의 짝수만 출력
/*
 * 
 * 3줄씩 출력
 * 2 4 6 
 * 8 10 12
 * 
 */
public class 제어문_반복문12 {
public static void main(String[] args) {
	
	
	int count=0;
	for(int i =1;i<=30;i++) {
		
		if (i%2==0) {
			System.out.printf("%2d\t",i);
			count++;
			
		}
		if (count%3==0) {
			System.out.println();
			
		}
		
		
	}
	
	
}
}
