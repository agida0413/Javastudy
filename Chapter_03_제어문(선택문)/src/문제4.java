import java.util.Scanner;
public class 문제4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("정수입력 : ");
	int a = scan.nextInt();
	if ((a%4==0 && a%100!=0)||a%100==0) {
		System.out.println(a+"는 윤년");
	}
	else {
		System.out.println(a+"는 윤년이아님");
	}
	
}
}
