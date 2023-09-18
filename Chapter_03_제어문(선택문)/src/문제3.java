import java.util.Scanner;
public class 문제3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("정수입력 : ");
	int a = scan.nextInt();
	
	
	if (a>=0) {
		System.out.println("a = "+a);
		
	}
	else {
		System.out.println("a = "+(a*-1));
		
	}
}
}
