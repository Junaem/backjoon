import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//백준 난이도별에는 없는데 그냥 한번 해봄. 중간정도 했는데 상체 하체를 안 나누고 했음. 나중에 처리하길
public class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		int ht = 2*n-1;
		int wd = 4*(n-2)+5;//4n-3 
		int mid = 2*n-1;

		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=ht; i++) {
			for(int j=1; j<=wd; j++) {
				
				if(i==1 || i==ht) {
					if(j<=n || j>=wd-n) 
						sb.append('*');
					else
						sb.append(' ');
				}//처음, 마지막 줄
				else {//
					if(j==i || j==wd-i+1 || j==mid  )
						sb.append(' ');
				}
					
				
				
				
			}
		}
	}
}