import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;
public class practice1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		
//		System.out.println("농구공 개수 ?:  ");
//		int quont =scan.nextInt();
//		int box = quont/5;
//		
//	   if ((quont%5)!= 0) {
//		   box++;
//		// (Math.ceil(ball)/5.0)) == > 올림 함수
//	}
//	System.out.println("농구공의 개수 : "+ quont);
//	System.out.println("박스 개수 : "+box);
//	
//	
//	System.out.println("char =");
//	
//	
//	char ch = scan.next().charAt(0);//문자열 0번째  갖고옴.
//	System.out.println(ch);
	
	   
		char ch = 'A'; 
		
//	    char lowerCase = (ch>='A' && ch<='Z'?(char)(ch+32):ch); 
//
//
//	    System.out.println("ch : " + ch); 
//	    System.out.println("ch to lowerCase : " + lowerCase);

	    
	    if (ch>='A' && ch<='Z') {
	    	
	    	
	    	String ch2 = String.valueOf(ch).toLowerCase();
	    	System.out.println(ch2);
	    	
		}
	    else {
			String ch2 = String.valueOf(ch).toUpperCase();
			System.out.println(ch2);
		}
		
	    
	    
	    
	    
	}
			
}
