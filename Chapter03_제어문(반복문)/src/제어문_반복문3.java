import java.util.Iterator;
import java.util.Scanner;
public class 제어문_반복문3 {
public static void main(String[] args) {
	int dan;
	Scanner scan = new Scanner(System.in);
	
	System.out.print("단 입력:");
	dan=scan.nextInt();
	
	
	for(int i = 1; i<=9;i++) {
		
		System.out.printf("%2d * %2d = %2d\n",dan,i,i*dan);
		
		
	}
}
}
