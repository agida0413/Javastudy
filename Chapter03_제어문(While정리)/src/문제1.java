import java.util.Scanner;
public class 문제1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두자리 정수를 입력하세요 : ");
		int a= scan.nextInt();
		
		if (a>=10 && a<=99) {
			
			if (a%11==0) {
				System.out.println("10의자리와 1의자리가 같습니다");
				
			}
			else {
				System.out.println("10의자리와 1의자리가 다릅니다.");
			}
			
		}
		
		else {
			System.out.println("잘못입력하셨습니다.");
		}
	}

}
