package bruteforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		System.out.println(Apoca(n));
		
	}
	static int Apoca(int n) {
		int sCnt=0;
		
		for(int i=666; ; i++) {
			int ii =i;
			while(ii>5) {
				if(ii%10==6) {
					ii/=10;
					if(ii%10==6) {
						ii/=10;
						if(ii%10==6) {
							sCnt++;
							ii/=1000;
						}
					}
				}else
					ii/=10;
				
				if(sCnt==n)
					return i;
			}
		}
	}
}