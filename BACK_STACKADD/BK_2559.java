package BACK_STACKADD;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK_2559{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        st = new StringTokenizer(br.readLine());

        for(int i = 1 ; i<=n; ++i){
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());

        }
        int a = -99999999;
        for(int i = 0 ; i<n-(k-1); ++i){
            if(i==0){

                int add = arr[k];
                if(add>a){
                    a = add;
                }
            }
            else{
                int num1 = arr[i];
                num1 = -num1;
                int add = arr[k+i]+num1;
                if(add>a){
                    a = add;
                }
            }


        }
        System.out.println(a);

    }
}
