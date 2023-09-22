import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int k[]=new int[5];
		
		for(int i=0; i<k.length;i++) {
			System.out.println("정수"+(i+1)+"입력");
			k[i]=scan.nextInt();
			
			
		}
		
		
		for(int i : k) {
			
			System.out.print(i + " ");
			
		}
		
	}
}
