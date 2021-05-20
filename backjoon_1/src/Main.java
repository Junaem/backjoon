import java.util.*;

public class Main {
    public static int[] visit = new int[10001];
    public static List<Integer> m[];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int array[] = new int[N + 1];
        m = new ArrayList[N+1];
        for(int i=1;i<=N;++i){
            m[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            m[a].add(b);
        }

        for (int i=1;i<=N;++i) {
            Arrays.fill(visit, 0);
            if(m[i].size()!=0){
                search(i,array);
            }
        }

        int max = 0;
        for (int i = 1; i <= N; ++i) {
            if (max <= array[i]) {
                max = array[i];
            }
        }

        for (int i = 1; i <= N; ++i) {
            if (array[i] == max) {
                System.out.print(i + " ");
            }
        }

    }

    public static void search(int node, int[] array) {
        visit[node] = 1;
        for (int i : m[node]) {
            if(visit[i]!=1){
                array[i]++;
                search(i, array);
            }

        }
    }
}