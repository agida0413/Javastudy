//10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성

import java.util.Arrays;

public class 배열문제_2 {
	public static void main(String[] args) {
	int arr[]=new int[10];
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			for(int j=0;j<i;j++) {
					if (arr[i]==arr[j]) {
						i--;
						break;
					}
				
				
			}
		}
		
		int max=0;
		int min=100;
		for(int i=0;i<arr.length;i++) {
			
			if (max<arr[i]) {
				max=arr[i];
			}
			
			if (min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}

}
