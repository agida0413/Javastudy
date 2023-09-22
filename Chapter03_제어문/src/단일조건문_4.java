//1~100 사이의 난수 3개 발생
//발생된 난수 출력
//max ,min
public class 단일조건문_4 {
public static void main(String[] args) {
	
	int a = (int)(Math.random()*100)+1;
	int b = (int)(Math.random()*100)+1;
	int c = (int)(Math.random()*100)+1;
	int max = a;
	int min =a;
	System.out.println("숫자1 : " + a);
	System.out.println("숫자2 : " + b);
	System.out.println("숫자3 : " + c);
	
	
	if (max==a) {
		max=a;
		
	}
	if (b>max) {
		
		max=b;
		
	}
	if (c>max) {

		max=c;
	}
	
	System.out.println("최대값"+max);
	
	
	if (min>b) {
		min=b;
		
	}
	if (min>c) {

		
		min=c;
	}
	
	System.out.println("최소값"+min);
	
} 
	
}
