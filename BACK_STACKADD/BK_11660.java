package BACK_STACKADD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BK_11660 {
    public static void main(String[] args)throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];



        for(int i = 1; i<=n; ++i){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=n; ++j){
                arr[i][j] = arr[i][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i<=m; ++i){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int num1 = 0;
            for(int j = x1; j<=y1; ++j){
                num1 = num1+(arr[j][y2]-arr[j][x2-1]);
            }
            sb.append(num1+"\n");
        }
        System.out.println(sb);
    }

}
