package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;
public class BK1931 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n =  Integer.parseInt(st.nextToken());

        int [][] arr = new int[n][2];
        for(int i = 0; i<n; ++i){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<2; ++j){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            }
            return Integer.compare(o1[1], o2[1]);
        });// 이거 중요하다

        int m = 0;
        int count = 0;




        for(int i = 0; i<n; ++i){
           if(arr[i][0]>= m){
               m = arr[i][1];
               count++;
           }
        }
        System.out.println(count);

    }
}
