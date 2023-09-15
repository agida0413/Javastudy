import java.util.Scanner;
public class 문제1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 :");
		
		int i= scan.nextInt();
		
		
		if (i>=50) {
			System.out.println(i+"는 50이상의 수");
			
			
			
		}
		
		if (i<50) {
			System.out.println(i+"는 50미만의 수");
			
		}
		
	}

}
