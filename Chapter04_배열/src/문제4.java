import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int k[]=new int [10];
		
		int total=0;
		for(int i=0; i<k.length;i++) {
			System.out.println("정수"+(i+1)+"입력 :");
			k[i]=scan.nextInt();
			total+=k[i];
			
			
			
		}
		System.out.println("총점 :"+total);
		System.out.println("평균 :"+total/k.length);
		
		
		
		
	}
}
