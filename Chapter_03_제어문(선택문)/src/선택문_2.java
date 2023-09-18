//사칙연산
//정수2개 ->연산자(문자열)
//정수3개 - > 1개 결과값
import java.util.Scanner;
	public class 선택문_2 {
		public static void main(String[] args) {
			
			int num1 ,num2;
			int result=0;
			Scanner scan = new Scanner(System.in);
			//초기화 
			System.out.println("첫번째 정수 입력 : ");
			num1=scan.nextInt();
			System.out.println("두번째 정수 입력 : ");
			num2=scan.nextInt();
			System.out.println("연산자 입력 : ");
			switch (scan.next()) {
			case "+": 
				result = num1 + num2;
			break;
			case "-":result = num1 - num2;
			break;
			case "*":result = num1 * num2;
			break;
			case "/":result = num1 / num2;
			break;
				default: System.out.println("잘못입력하셨습니다.");
		
			
			
		}
			
		System.out.println(result );

}
		}
