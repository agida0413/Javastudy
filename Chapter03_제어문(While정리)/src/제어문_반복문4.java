//do~while
// up down
import java.util.Scanner;
public class 제어문_반복문4 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int com=(int)(Math.random()*100)+1;
	
	do {
			System.out.println("정수입력(1~100): ");
			int user =scan.nextInt();
		
			if (com<user) {
				System.out.println("입력한 값보다 작은수를 입력하세요:");
			}
			else if (com>user) {
				System.out.println("입력한 값보다 큰수를 입력하세요:");
				
			}
			else {
				System.out.println("게임오버");
				break;
			
			}
		
		
	} while (true);
	
	
	
}
}
