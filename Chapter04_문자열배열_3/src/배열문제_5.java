
//위 문제 배열 중에서 최대값의 인덱스를 출력하시오. 


import java.util.Arrays;

public class 배열문제_5 {
	public static void main(String[] args) {
		int arr[]=new int[10];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			
				}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]);
		
		int min=100;
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if (max<arr[i]) {
				max=arr[i];
				
			}
			if (min>arr[i]) {
				min=arr[i];
				
			}
			
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}
}
