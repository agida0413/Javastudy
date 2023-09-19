//100번의 알파벳 난수발생 A,B,C 개수

import java.util.Iterator;

public class 제어문_반복문8 {
	public static void main(String[] args) {
		
		int a= 0;
		int b=0;
		int z=0;
		for(int i =0;i<100;i++) {
			
			char c = (char)((Math.random()*26)+65);
			
			if (c=='A') {
				a++;
				
			}
			if (c=='B') {
				b++;
				
			}
			if (c=='C') {
				z++;
				
			}
			
			
			
			System.out.print(c+ " ");
			
		}
				
		System.out.println();
		System.out.println("A는 "+a+"개");
		System.out.println("B는 "+b+"개");
		System.out.println("C는 "+z+"개");
		
		
		
	}

}
