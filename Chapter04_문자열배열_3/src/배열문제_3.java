//100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오

import java.util.Arrays;

public class 배열문제_3 {
	public static void main(String[] args) {
		int arr[]=new int[10];
		int num[]=new int[10];
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
			
				
				
			
		}
		
		
		for(int i =0; i<num.length;i++) {
			
				num[arr[i]]++;
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(num));
	}
}
