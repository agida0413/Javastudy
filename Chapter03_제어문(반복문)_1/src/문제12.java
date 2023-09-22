
public class 문제12 {
public static void main(String[] args) {
	
	int sum1 = 0;
	int sum2 = 0;
for(int i =1; i<=1000;i++) {
	
	if (i%7==0) {
		sum1+=i;
		
	}
	if (i%9==0) {
		sum2+=i;
		
	}
	
}

System.out.println("7의배수 : "+sum1);
System.out.println("9의배수 : "+sum2);
System.out.println("7의배수+9의배수 : "+ (sum1+sum2));
	
}
}
