import java.util.*;
public class 문자열5 {
	public static void main(String[] args) {
	
	String s="1상승";
	String id=s.replaceAll("[가-힣]", "");
	String state=s.replaceAll("[0-9]", " ");
	
	System.out.println("id="+id);
	System.out.println("state="+state);
	System.out.println("▲"+id);
	
	
	
	s="Hello Java!!";
	String ss=s.replace('a', 'b');
			
	System.out.println(ss);
	ss=s.replace("Java", "Phyton");
	System.out.println(ss);
	
	//replace('char','char')
	//replace("string","string")
	}

}
