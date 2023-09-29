//10개의 정수를 입력받아서 짝수의 최대값,홀수의 최대값을 출력하는 프로그램을 작성하시오

import java.util.Arrays;
import java.util.Scanner;

public class 배열문제_11 {
	public static void main(String[] args) {
		int[]odd=new int[10];
		int[] even=new int[10];
		Scanner scan= new Scanner(System.in);
		
	for(int i=0;i<odd.length;i++) {
			System.out.print("수"+(i+1)+"을 입력하세요:");
			int k=scan.nextInt();
		if (k<=0) {
			i--;
			continue;
			}
			if (k%2==0) {
				even[i]=k;
				odd[i]=0;
			}
			else {
				odd[i]=k;
				even[i]=0;
			}
		
	}
	
	System.out.println(Arrays.toString(even));
	System.out.println(Arrays.toString(odd));
	
	
	int max= 0;
	int min=100;
	
	for(int i=0;i<even.length;i++) {
			if(even[i]!=0) {
			if (max<even[i]) {
				max=even[i];
			}
			if (min>even[i]) {
				min=even[i];
			}
	}
	}		
	
	System.out.println("짝수의 최대값: "+max);
	System.out.println("짝수의 최소값:"+min);
	max=0;
	min=100;
	
	for(int i=0;i<odd.length;i++) {
		if(odd[i]!=0) {
		if (max<odd[i]) {
			max=odd[i];
		}
		if (min>odd[i]) {
			min=odd[i];
		}
		}
}
	
	System.out.println("홀수의최대값: "+max);
	System.out.println("홀수의 최소값: "+min);
	}
	
}
