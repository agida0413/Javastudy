/*
 * 
 * while =>1차
 * 형식) 초기값 ======1
 * while(조건식)======1
 * 	{
 * 
 * 	반복수행 문장3
 * 증가식4 ======>2번으로 이동
 * 				---false종료
 * 				----true 문장수행
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
//1~100사이의 짝수의 합, 홀수의 합
public class 제어문_반복문_1 {
	public static void main(String[] args) {
		int even=0 ,odd=0;
		int  i =1;
		while(i<=100) {
			
			if (i%2==0) {
				even+=i;
				
			}
			else {
				odd+=i;
			}
			
			i++;
		}
		
		System.out.println("짝수합: "+even);
		System.out.println("홀수합 : "+odd);
	}

}
