/*
 * 	while 
 * ---------
 * => 10개의 난수발생 1~100 
 * => 최댓값/ 최솟값 
 * 
 * 
 * 
 */
public class 제어문_반복문2 {
	
	
	public static void main(String[] args) {
		int max=1;
		int min=100;
		
		
		int i=1;//루프변수
			
			
		 while(i<=10) {
			 int rand=(int)(Math.random()*100)+1;
			 System.out.print(rand+" ");
			 	i++	;
			 	if (rand>max) {
					max=rand;
				}
			 	if (min>rand) {
			 		min=rand;
					
				}
		 	}
		 System.out.println();
		 System.out.println("최대값 : "+max);
		System.out.println("최소값: "+min);
		
	}

}
