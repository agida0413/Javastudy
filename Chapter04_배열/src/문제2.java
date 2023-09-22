/*
 * 
 * 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라. 

 * 
 */

import java.util.Scanner;

public class 문제2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int k[]=new int[10];
		int total=0;
		for(int i=0;i<k.length;i++) {
				
			
			k[i]=(int)(Math.random()*10)+1;
			System.out.print(k[i]+" ");
			total+=k[i];
			
		}
		System.out.println("\n---------------------");
		System.out.println("총합 : "+total);
		System.out.println("평균 : "+(total/10.0));
		
	}

}
