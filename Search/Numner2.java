package Search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Numner2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 0; i<n; ++i){

            String value = in.next();
            map.put(value, map.getOrDefault(value, 0) + 1);
            // 중요하다 외우자 map.put(value, map.getOrDefault(value, 0) + 1);
        }
        int n2 = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n2; ++i){

            String value = in.next();
            sb.append(map.getOrDefault(value, 0) + " ");

        }
        System.out.println(sb);
        in.close();
    }
}
