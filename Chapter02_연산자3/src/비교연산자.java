//정수 , 실수 , 문자 비교시에 많이 사용  ===> boolean
//비교연산자
/*	==
	!=
	>
	>
	<=
	>=*/
	public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =(int )(Math.random()*3)+1;
		int b =(int )(Math.random()*3)+1;

		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a==b"+(a==b));
		System.out.println("a!=b"+(a!=b));
		System.out.println("a<b"+(a<b));
		System.out.println("a>b"+(a>b));
		System.out.println("a<=b"+(a<=b));
		System.out.println("a>=b"+(a>=b));
		
		
		char c = (char)((Math.random()*3)+65);
		char d = (char)((Math.random()*3)+65);
		System.out.println(c+","+d);
		System.out.println(c==d);

		
		
	}

}
