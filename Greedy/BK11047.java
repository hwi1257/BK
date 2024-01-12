package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BK11047{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> hs = new HashMap<Integer, Integer>();
        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        for(int i = 1; i<=n; ++i){
            st = new StringTokenizer(br.readLine());

            hs.put(i,Integer.parseInt(st.nextToken()));
        }
        int count = 0;
        for(int i = n; i>=1; --i){
            if(hs.get(i)<=m){
                while(hs.get(i)<=m){
                    m = m - hs.get(i);
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
