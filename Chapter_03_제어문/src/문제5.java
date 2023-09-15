import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
			
			System.out.println("정수 입력 :");
			int i= scan.nextInt();
		if (i<0) {
			System.out.println(i+"는 음수입니다");
			
		}
		if (i>0) {
			System.out.println(i+"는 양수입니다");
			
		}
		if (i==0) {
			System.out.println(i+"는 0입니다.");
			
		}
	}

}
