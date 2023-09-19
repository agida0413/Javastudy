/*주사위 2개를 던져서 합이 6이 나올 경우 의 수를 출력하시오
 *  1~6
 * 
 * 
 */

import java.util.Iterator;

public class 제어문_반복문13 {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=6;i++) {
			
				for(int j=1;j<=6;j++) {
					
					if (i+j==6) {	
						
						System.out.println(i+","+j);
						
					}
					
					
					
				}
			
			
		}
		
		
		
		
	}
}
