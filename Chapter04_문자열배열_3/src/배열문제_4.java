//10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.

import java.util.Arrays;

public class 배열문제_4 {
	public static void main(String[] args) {
		int arr[]=new int[10];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			
				}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]);
		
		
	}
}
