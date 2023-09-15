import java.util.Scanner;
public class 단일조건문 {
	
	/* 
	 * 
	 * if(조건문) { 
	 * 				실행문장 = > 조건문이 true 일때만 수행이 가능		
	 * 				
	 * 		   }
	 * 			==> 조건문 : 반드시 (true/false)
	 * 							----------
	 * 							비교연산자/논리연산자/부정연산자
	 * 
	 * 		
	 * 
	 * 
	 * 
	 * 
	 */
//두개의 정수, 연산자 + ,-,*,/ 
//	=>간단한 계산기
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		boolean check =true;
		
		while(check) {
		System.out.print("정수1(을)를 입력하세요 : ");
		int i = scan.nextInt();
		
		System.out.print("정수1(을)를 입력하세요 : ");
		int k = scan.nextInt();
		System.out.print("수식어를 입력하세요 : "); // Scanner.next().charAt(0);
		String str = scan.next();
		int result;
		
		if (str.equals("+")) {
			result = i+k; 
			System.out.print(result);
			break;
		}
		else if (str.equals("*")) {
			result = i*k;
			System.out.print(result);
			break;
		}
		else if (str.equals("-")) {
			
			result=i-k;
			System.out.print(result);
			break;
		}
		else if (str.equals("/")) {
			
			result=i/k;
			System.out.print(result);
			break;
		}else {
			
			System.out.println("잘못입력하셨습니다");
			System.out.println("===============================");
			System.out.println("초기화면으로 돌아갈까요?(Y/N) ");
			String check1 =scan.next();
			if (check1=="Y") {
				break;
				
			}
			
			
			else if(check1=="N"){
				System.out.println("프로그램을 종료합니다");
				
			
			
			}
			continue;
			
			
		}
		
		}
		
		
		
	}
}
