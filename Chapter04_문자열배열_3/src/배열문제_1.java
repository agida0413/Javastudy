import java.util.Scanner;
//5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성

public class 배열문제_1 {
public static void main(String[] args) {
	int rank []=new int[5];
	int kor[]=new int [5];
	
	Scanner scan = new Scanner(System.in);
	
	
	for(int i =0 ; i<kor.length;i++) {
		
		System.out.print((i+1)+"번째 학생 점수를 입력하세요:");
		kor[i]=scan.nextInt();
		
		
	}
	
	
	for(int i =0;i<rank.length;i++) {
		rank[i]=1;
		for(int j=0;j<rank.length;j++) {
			if (kor[i]<kor[j]) {
				rank[i]++;
			}
			
			
		}
		
		
	}
	for(int i=0; i<kor.length;i++) {
		
		System.out.println("==========================");
		System.out.println((i+1)+"번째 학생 점수 : "+kor[i] );
		System.out.println((i+1)+"번째 학생 랭킹 : "+rank[i] );
		System.out.println("===========================");
	}
	
}
}
