
public class 제어문_반복제어문2 {
public static void main(String[] args) {
	/* 	i=1 j=1,2,3
	 * 	i=2 j=1,2,3
	 * 	i=3 j=1,2,3
	 */
	
	for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if (j==2) {
					break;
					
				}
				System.out.println("i="+i+","+"j="+j);
				
			}
		
		
	}
	System.out.println("\n=====================");
	
	
	
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=3;j++) {
			if (j==2) {
			continue;
				
			}
			System.out.println("i="+i+","+"j="+j);
			
		}
}
	
	
	
	System.out.println("\n===========이름있는break==========");
	
 outer:for(int i=1;i<=3;i++) {
		for(int j=1;j<=3;j++) {
			if (j==2) {
			break outer;
				
			}
			System.out.println("i="+i+","+"j="+j);
			
		}
}
	
	
}
}
