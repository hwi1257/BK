package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BK11399 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n =  Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());


        int[] arr = new int[n];

        for(int i = 0; i<n; ++i){
            arr[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;
        int count2 = 0;
        for(int i = 0; i<n; ++i){
            count = count+arr[i];
            count2 = count2+count;
        }

        System.out.print(count2);
    }
}
