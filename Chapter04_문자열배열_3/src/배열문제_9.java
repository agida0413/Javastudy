import java.util.Arrays;

public class 배열문제_9 {
public static void main(String[] args) {
	char []arr =new char[26];
	
	for(int i=0; i<arr.length;i++) {
		
			arr[i]=(char)((Math.random()*26)+65);
		
			for(int j=0;j<i;j++) {
				if (arr[j]==arr[i]) {
					i--;
					break;
				}
				
			}
			
	}
	System.out.println(Arrays.toString(arr));
	
	
	for(int i=0; i<arr.length-1;i++) {
		
			for(int j=0;j<arr.length-i-1;j++) {
				if (arr[j]>arr[j+1]) { // 역순arr[j]<arr[j+1])
					char temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				
				
			}
		
	}
	
System.out.println(Arrays.toString(arr));
}
}
