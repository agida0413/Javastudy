import java.util.Scanner;
public class 문제5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("정수입력 : ");
	int a = scan.nextInt();

	char c = ' ';
	if (a>=90&& a<=100) {
		System.out.println("A학점입니다.");
		
	}
	if (a<90 && a>=80) {
		System.out.println("B학점입니다.");
	
}
	if (a<80 && a>=70) {
		System.out.println("C학점입니다.");
		

	
}

	if (a<70 && a>=60) {
		System.out.println("D학점입니다.");

}
	if (a<60) {
		System.out.println("F학점입니다.");
		
	}
	
	
	
}
}
