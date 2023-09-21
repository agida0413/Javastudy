//while 메뉴
import java.util.Scanner;
public class 제어문_반복문3 {
public static void main(String[] args) {
	while(true) {
		
		System.out.println("========메뉴========");
		System.out.println("1.뮤직목록");
		System.out.println("2.가수찾기");
		System.out.println("3.노래찾기");
		System.out.println("4.상세보기");
		System.out.println("5.종료");
		System.out.println("===================");
		System.out.print("메뉴선택 : ");
		Scanner scan = new Scanner(System.in);
		
		int menu = scan.nextInt();
		if (menu==5) {
			System.exit(0);
			
		}
	}
}
}
