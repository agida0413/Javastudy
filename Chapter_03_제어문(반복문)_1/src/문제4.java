import java.util.Iterator;
import java.util.Scanner;
public class 문제4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("정수입력 :");
	int max = scan.nextInt();
	int sum=0;
	for(int i=1;i<=max;i++) {
		sum+=i;
		
		
	}
	System.out.println("1부터~"+max+"까지의 합 : "+sum);
}
}
