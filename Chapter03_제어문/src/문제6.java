
public class 문제6 {
	public static void main(String[] args) {
		
		
		int a = (int)(Math.random()*2);//0,1
		
		if (a==0) {
			
			char c = (char)((Math.random()*26)+65);
			
				
			System.out.println(c+"는 대문자");
			
		}
		if (a==1) {
			
			char c = (char)((Math.random()*26)+97);
			
			System.out.println(c+"는 소문자");
			
		}
		
		
		
	}

}
