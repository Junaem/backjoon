package ele_math2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3009{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arrX = new int[3];
		int[] arrY = new int[3];
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arrX[i] = x;
			arrY[i] = y;
		}
		
		int newX,newY;
		
		if(arrX[2]==arrX[0])
			newX = arrX[1];
		else if(arrX[2]==arrX[1])
			newX = arrX[0];
		else
			newX = arrX[2];

		if(arrY[2]==arrY[0])
			newY = arrY[1];
		else if(arrY[2]==arrY[1])
			newY = arrY[0];
		else
			newY = arrY[2];
		
		System.out.println(newX + " " + newY);
	}
}