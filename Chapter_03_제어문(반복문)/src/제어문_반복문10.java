import java.util.Iterator;
import java.util.Scanner;
//사용자가 정수1입력 -> 입력받은 수 까지의 합으 10 1~10
public class 제어문_반복문10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int input = scan.nextInt();
		
		int sum=0;
		for(int i = 1; i<=input;i++) {
			
			sum+=i;
			
		}
		System.out.println("1~"+input+"까지의 합 : "+sum);
		
	}

}
