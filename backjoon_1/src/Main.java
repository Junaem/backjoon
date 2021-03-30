import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		
		for(int i=0; i<n; i++) {
			arr[i][0] = br.readLine();
			arr[i][1] = arr[i][0].length()+"";
		}
		br.close();
		
		Arrays.sort(arr, (e1, e2) ->{
			if(Integer.parseInt(e1[1]) == Integer.parseInt(e2[1])) {
				for(int i=0; i<Integer.parseInt(e1[1]);i++) {
					if(e1[0].charAt(i)!=e2[0].charAt(i))
						return e1[0].charAt(i) - e2[0].charAt(i);
				}
				return -1;
			}else {
				return Integer.parseInt(e1[1]) - Integer.parseInt(e2[1]);
			}
		});
		
		boolean exst = false;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			exst=false;
			
			for(int j=0; j<i; j++) {
				if(arr[j][0].equals(arr[i][0])) {
					exst=true;
					break;
				}
			}
			if(exst==false)
				sb.append(arr[i][0]).append('\n');
		}
		System.out.println(sb);
	}
}