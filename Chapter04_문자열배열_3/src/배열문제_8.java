import java.util.Arrays;
import java.util.Scanner;

public class 배열문제_8 {
	public static void main(String[] args) {
		int arr[]=new int[5];
		int index1;
		int index2;
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			
				}
		Scanner scan =new Scanner(System.in);
		
		System.out.println("인덱스 1입력 : ");
		index1=scan.nextInt();
		System.out.println("인덱스 2입력 : ");
		index2=scan.nextInt();
		
		System.out.println("====변경전====");
		System.out.println(Arrays.toString(arr));
		System.out.println("===변경후=====");
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		System.out.println(Arrays.toString(arr));
		
	}
}
