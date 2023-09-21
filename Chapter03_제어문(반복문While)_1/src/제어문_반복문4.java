//사용자로부터 정수 1개 = > 구구단
import java.util.Scanner;
public class 제어문_반복문4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("단입력 : ");
		int dan = scan.nextInt();
		
		int i=1;
		while(i<=9) {
			
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
			
		}
		System.out.println();
		
	}

}
