//정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하시오

import java.util.Scanner;

public class 배열문제_10 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner scan =new Scanner(System.in);
		int i=0;
		while(i<10) {
			System.out.println("정수 "+(i+1)+"을 입력하세요");
			arr[i]=scan.nextInt();
			if (arr[i]<=0) {
				continue;
				
			}
			i++;
		}
		
		for(int a : arr) {
			if (a%3==0) {
				System.out.print(a+ " ");
				
			}
			
			
		}
	}
}
