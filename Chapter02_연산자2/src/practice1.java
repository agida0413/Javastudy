import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		//사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int a=  scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		
		int b =scan.nextInt();
		
		
		int plus = a-b;
		int multi = a*b;
		
		
		System.out.println("뺄셈 : "+a+"-"+b+"="+(a-b));
		System.out.println("덧셈 : "+ a+"*"+b+"="+(a*b));
		
		
	
	}
}
