import java.util.Scanner;
public class 제어문_반복제어문3 {
	//면접
//	-----
	/*함수vs메소드
	 * --------한가지 기능을 수행
	 * 함수:독립적으로 사용
	 * 메소드:클래스 종속
	 * --------------종료하는시점 return
	 * 
	 * 
	 * 
	 * 
	 */
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(true) {
		System.out.print("메뉴 선택:");
		int menu=scan.nextInt();
		if (menu<1 ||menu>9) {
			System.out.println("잘못입력");
			continue;//조건식으로 이동
			}
		if (menu==9) {
			break;
		}
		System.out.println(menu+"번 메뉴를 선택하셨습니다.");
		
		
	}
	System.out.println("프로그램종료");
}	
	
}
