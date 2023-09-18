import java.util.Scanner;
public class 문제6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("정수입력 : ");
	int score = scan.nextInt();
	int grade = score/10;
	
	switch(grade) {
	
	case 10:
	case 9:System.out.println("A학점입니다.");
	break;
	case 8:System.out.println("B학점입니다.");
	break;
	case 7:System.out.println("C학점입니다.");
	break;
	case 6:System.out.println("D학점입니다.");
			default : System.out.println("F학점입니다");
	
			}
				
			
			
			}
		
	
	
	}
	


