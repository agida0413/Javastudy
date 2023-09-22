
public class 문제9 {
public static void main(String[] args) {

	int sum=0;
	int counter=0;
	
	for(int i=100;i<=999;i++) {
		
		if (i%4!=0) {
			counter++;
			sum+=i;
		}
		
		
	}
	
	System.out.println("갯수:"+counter);
	System.out.println("합 : "+sum);
	
}
}
