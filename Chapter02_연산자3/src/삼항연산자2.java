/*
 * 
 * 컴퓨터와 가위바위보 게임(0,1,2) 0 = 가위 1 = 바위 2 = 보
 * 
 *  // 이기는 경우 (컴퓨터 숫자 - 사용자 숫자) = -1 ,2
 *  // 비기는 경우 0
 *  // 지는 경우 1 ,-2 
 */
import java.util.Scanner;
public class 삼항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2) 입력 : ");
		
		String str[]=new String[] {"가위","바위","보"};
		
		int user = scan.nextInt();
	
		int computer = (int)(Math.random()*3);
		//0~2.999999
		
	
		
		
		System.out.print("컴퓨터 : ");
		System.out.print(computer==0?"가위":" ");
		System.out.print(computer==1?"바위":" ");
		System.out.print(computer==2?"보":" ");
		System.out.println();
		System.out.print("플레이어 : ");
		System.out.print(user==0?"가위":" ");
		System.out.print(user==1?"바위":" ");
		System.out.print(user==2?"보":" ");
		System.out.println();

		System.out.println("==============");
		System.out.println(computer-user==-1||computer-user==2?"사용자 win":" ");
		System.out.println(computer-user==-2||computer-user==1?"사용자 win":" ");
		System.out.println(computer-user==0?"비겼다":" ");
	
		
		
		}
		
		
	}


