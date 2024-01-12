package tip1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BK_1302 {
    public static void main(String[] args)throws IOException {
        HashMap<String, Integer> hs = new HashMap<String,Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i<n; ++i){
            st = new StringTokenizer(br.readLine());
            String string = new String(st.nextToken());
            hs.put(string,hs.getOrDefault(string,0)+1);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hs.entrySet());
        // 해쉬 맵을 리스트로 변환
        //entryList.sort(Collections.reverseOrder(Map.Entry.comparingByKey()));
        // 리스트 내림차순
        entryList.sort(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));
        //for(Map.Entry<String, Integer> entry : entryList){
          //  System.out.println((entry.getKey()));
        //}
        //리스트 춝력

        Map.Entry<String, Integer> maxEntry = entryList.get(0);
        System.out.println(maxEntry.getKey());




    }
}
