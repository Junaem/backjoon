package ele_math;
import java.io.IOException;
import java.util.Scanner;

public class Q10757_failed {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int[] arr;
		int length, mLength;
		
		if(a.length()>b.length()) {
			length = a.length();
			mLength = b.length();
			arr = new int[length+1];
		}
		else{
			length = b.length();
			mLength = a.length();
			arr = new int[length+1];
		}
		
		for(int i=length; i>0; i--) {
			arr[i] = Integer.parseInt(b, , i, i);
		}
		for(int i=length; i>length-mLength; i--) {
			if(arr[i]+b.charAt(i)>=10)
				
				
		}
		
		
		
		
	}
}
