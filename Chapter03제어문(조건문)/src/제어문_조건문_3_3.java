//정수 1개를 받는다
// 1 = > 메모장 , 2 => 그림판 ,3 = > 브라우저
//메뉴를 클릭 / 버튼 클릭시 처리=> GUI
import java.util.Scanner;
public class 제어문_조건문_3_3 {

	public static void main(String[] args) throws Exception{
		int no=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호선택(1,2,3 : "  );
		no = scan.nextInt();
		
		if (no==1) {
			System.out.println("메모장을 선택하셨습니다.");
		}
		else if (no==2) {
			System.out.println("그림판을 선택하셨습니다.");
			
		}
		else if (no==3) {
			
			System.out.println("브라우저를 선택하셨습니다.");
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			/*
			 * \n
			 * \t
			 * \"
			 * \\ < ===== 역슬래시 
			 * 
			 * 
			 */
			
		}
		else {
			System.out.println("메뉴가 존재하지않습니다.");
		}
		
		
		
	}
}
