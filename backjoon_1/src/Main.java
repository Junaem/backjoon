import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<m; i++) {
			int[] arr = new int[m];
			
			for(int j=1; j<=n; j++) {
				boolean exst = false;
				for(int a : arr) {
					if(a==j)
						exst = true;
				}
				if(!exst)
					arr[i] = j;
			}
			for(int j=0; j<m; j++)
				sb.append(arr[i]).append(' ');
			sb.append('\n');
		}
		
	}
}