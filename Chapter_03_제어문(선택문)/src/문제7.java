import java.util.Scanner;
public class 문제7 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1입력 : ");
		int a = scan.nextInt();

		System.out.println("정수2입력 : ");
		int b = scan.nextInt();
		
		int result = 0;
		System.out.println("연산을 입력하세요 : ");
		char op = scan.next().charAt(0);
		
//		if (op=='+') {
//			result = a+ b;
//			System.out.println(a+"+"+b+"="+result);
//			
//		}
//		else if (op=='-') {
//			result = a-b;
//			
//			System.out.println(a+"-"+b+"="+result);
//		}
//		else if (op=='*') {
//			result = a* b;
//			
//			System.out.println(a+"*"+b+"="+result);
//		}
//		else if (op=='/') {
//			
//				if (b==0) {
//					System.out.println("잘못입력하셨습니다.");
//					
//				}
//				else {
//					result = a/b;
//					System.out.println(a+"/"+b+"="+result);
//				}
//		}
//		
//		
//		else {
//			System.out.println("잘못입력하셨습니다.");
//		}
//		
//		
//	
		
		switch(op) {
		case '+' : result = a+b; 
		System.out.println(a+"+"+b+"="+result);
		break;
		
		case '-' : result = a-b; 
		System.out.println(a+"-"+b+"="+result);
		break;
		case '*' : result = a*b; 
		System.out.println(a+"*"+b+"="+result);
		break;
		case '/' :
			
			switch(b) {
			case 0 : System.out.println("잘못입력");
			break;
				default:result = a/b; 
				System.out.println(a+"/"+b+"="+result);
			
			
			
			}
			break;
			
			
			default: System.out.println("잘못입력");
		
		
		
		
		
		
		}
		
		
		
	}

}
