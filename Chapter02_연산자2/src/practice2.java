//13) 사용자로부터 세 개의 정수를 입력받은 다음에 곱과 합을 순서대로 진행해서 그 결과를 출력하는 프로그램을 작성해 보 자.
/*예를 들어 사용자로부터 순서대로 입력받은 세 개의 정수가 1, 2, 3 이라면 1 * 2 + 3의 계산 결과를 출혁해야 한다. 단 출력 양식은 다음과 같아야 한다.
*/

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int a=  scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		
		int b =scan.nextInt();
		
		
		System.out.print("두번째 수를 입력하세요 : ");
		
		int c =scan.nextInt();
		
		
		int result = a*b+c;
		
		System.out.println(a+"*"+b+"+"+c+"="+result);
		
	}
}
