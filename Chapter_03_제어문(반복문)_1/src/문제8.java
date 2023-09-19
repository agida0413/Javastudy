
public class 문제8 {
public static void main(String[] args) {
	int sum=0;
	int counter=0;
	
	for(int i=100;i<=999;i++) {
		
		if (i%7==0) {
			
			sum+=i;
			counter++;
			
		}
		
		
		
	}
	
	System.out.println("7의 배수 갯수 : "+counter);
	System.out.println("7의 배수 합 : "+sum);	
}
}
