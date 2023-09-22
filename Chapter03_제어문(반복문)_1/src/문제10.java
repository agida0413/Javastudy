
public class 문제10 {
public static void main(String[] args) {
	int odd=0;
	int even=0;
	
	for(int i=0;i<=30;i++) {
		
		if (i%2==0) {
			even+=i;
			
		}
		else {
			odd+=i;
		}
		
	}
	
	System.out.println("짝수합 : "+even);
	System.out.println("홀수합 : "+odd);
}
}
