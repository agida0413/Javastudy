//10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.

import java.util.Arrays;

public class 배열문제_6 {
public static void main(String[] args) {
	int arr[]=new int[10];
	
	for(int i=0; i<arr.length;i++) {
		arr[i]=(int)(Math.random()*100)+1;
		
			}
	
	int sum=0;
	
	for(int a : arr) {
		
		sum+=a;
		
	}
	System.out.println(Arrays.toString(arr));
	System.out.println("총합 : "+sum);
	System.out.println("평균 : "+sum/(double)arr.length);
	
}
}
