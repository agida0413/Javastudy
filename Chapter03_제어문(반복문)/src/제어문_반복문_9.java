/*
 * 
 * updown 게임
 * -----------
 * 
 * 컴퓨터 난수발생 : 1~100
 * 
 * => 힌트
 * 	  ---
 *    => 정답이 나올때 까지 반복
 *    	-------------------무한 루프
 *    
 *    	for(;;) = > while(true)
 * 
 * 
 * 
 * 
 */
import java.util.Iterator;
import java.util.Scanner;
public class 제어문_반복문_9 {
public static void main(String[] args) {
	//난수발생
	//종료 - > break , system.exit(0)
	
	int com =(int)(Math.random()*100)+1;
	Scanner scan =new Scanner(System.in);
	int count =0;
	for(;;) {//무한루프
		
		
		System.out.print("1~100사이의 값을 입력하세요 : ");

		int user = scan.nextInt();
		if (user<1 || user>100) {
			System.out.println("잘못입력하셨습니다...");
			continue;
		}
		count++;
		//hint 
		if (com>user) {
			System.out.println("높은 정수 입력(UP)");
		}
		else if (com<user) {
			System.out.println("낮은 정수 입력(DOWN)");
			
		}
		
		else {//정답
			System.out.println("Game Over");
			System.out.println("입력횟수 : "+count);
			System.exit(0);//프로그램종료
			
		}
		
		
		}
	}
}

