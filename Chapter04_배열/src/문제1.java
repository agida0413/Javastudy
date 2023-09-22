import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


// 가위바위보 
public class 문제1 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int k[]= new int[10];
	for(int i =0;i<k.length;i++) {
		
		System.out.println("정수 "+(i+1)+"를 입력하세요 : ");
		k[i]=scan.nextInt();
		
			
			
		if (k[i]<0) {
			System.out.println("잘못입력하셨습니다.");
			continue;
			
			
			
		}
		
		
		
		
	}
	
	for(int i : k) {
		System.out.print(i);
	}
	System.out.println("===================");
				
	for(int i=0;i<k.length;i++) {
		
		if (k[i]%3==0) {
			System.out.print(k[i]+" ");
			
		}
	}
	
	
	
	}

}