//1~100 =>루프변수
//총합 , 짝수의 합 , 홀수

import java.util.Iterator;

public class 제어문_반복문4 {
public static void main(String[] args) {
	
	int sum_total=0;
	int sum_even=0;
	int sum_odd=0;
	for(int i =1; i<=100;i++) {
		sum_total+=i;
		
		if (i%2==0) {
			
			sum_even+=i;
			
		}
		
		if (i%2!=0) {
			sum_odd+=i;
		}
		
		
	}
	
	System.out.println(sum_total);
	System.out.println(sum_even);
	System.out.println(sum_odd);
}
}
