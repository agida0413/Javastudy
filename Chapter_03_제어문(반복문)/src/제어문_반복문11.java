//20개의 정수 난수 발생 = >짝수,홀수

import java.util.Iterator;

public class 제어문_반복문11 {
public static void main(String[] args) {
	int even=0,odd=0;
	
	for(int i=0;i<20;i++) {
		int rand = (int)(Math.random()*10)+1;
		
		if (rand%2==0) {
			even++;
			
		}
		if (rand%2!=0) {
			odd++;
			
		}
		
		System.out.print(rand + " ");
		
	}
	System.out.println("\n==================결과값====================");
	System.out.println("짝수의 개수 :"+even);
	System.out.println("홀수의 개수 :"+odd);
	
System.out.println();


int third =0;
int five = 0;
int seven = 0;


for(int i =0; i<20;i++) {
int rand2 = (int)(Math.random()*10)+1;

if (rand2%3==0) {
	third++;
	
}
if (rand2%5==0) {
	five++;
	
}
if (rand2%7==0) {
	seven++;
	
}


System.out.print(rand2 + " ");



}

System.out.println("\n==================결과값====================");
System.out.println("3의배수의 개수 :"+third);
System.out.println("5의배수의 개수 :"+five);
System.out.println("7의배수의 개수 :"+seven);
System.out.println("===================");

//1-2+3-4+5......
int sum=0;
for(int i=1;i<=10;i++) {
	
	if (i%2==0) {
		sum-=i;
	}
	
	if (i%2!=0) {
		sum+=i;
	}
	
	
}

//for문 수행시에 =>수열(숫자마다 패턴을 가지고 있어야 반복문이 수행된다)

//BDFHJLN
for(char c ='B';c<='N';c+=2) {
	System.out.print(c);
	
	
}
}
}
