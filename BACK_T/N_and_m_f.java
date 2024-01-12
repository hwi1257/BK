package BACK_T;

import java.util.Scanner;

public class N_and_m_f {
    static  StringBuilder sb = new StringBuilder();

    static int n,m;

    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        m = in.nextInt();

        visit = new boolean[n];

        arr = new int[m];

        dfs(0);

        System.out.println(sb);

    }

    public static void dfs(int depth){
        if(depth == m){
            for(int val:arr){
                sb.append(val).append(" ");

            }
            sb.append("\n");

            return;
        }

        for(int i = 0; i<n; ++i){
            if(!visit[i]){

                arr[depth] = i+1;
                dfs(depth+1);

            }

        }
    }
}
