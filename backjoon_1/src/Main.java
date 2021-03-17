import java.util.Scanner;

public class Main{
	
	static void PrmTime(boolean[] arr) {
		for(boolean a : arr) {
			a=true;
		}
		arr[0] = arr[1] = false;
		
		for(int i=2; i*i<arr.length; i++) {
			if(arr[i]==false)
				continue;
			for(int j=i*i; j<arr.length; j+=i) {
				arr[j] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		boolean[] arr =new boolean[10001];
		PrmTime(arr);
		
		while(t-- >0) {
			int n = sc.nextInt();
			int a = n/2;
			int b = n/2;
			
			while(true) {
				
				if(arr[a] && arr[b]) {
					System.out.println(a+" "+b);
					break;
				}
				a--;
				b++;
			}
			
		}
	}
}