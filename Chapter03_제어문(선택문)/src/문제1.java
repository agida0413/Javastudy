import java.util.Scanner;
public class 문제1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int a = scan.nextInt();
		
		if (a>=0) {
			System.out.println(a+"는 양수입니다.");
			
		}
		
		else if (a<100) {
			
			System.out.println(a+"는 음수입니다.");
			
		}
		
	}

}
