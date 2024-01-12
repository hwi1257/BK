package tip1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BK_1431treeset {
    public static void main(String[] args) throws IOException {
        Comparator<String> lengthComparator = Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder());
        // 문자열 길이순으로 정렬후 사전순 정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<String> list = new ArrayList<>();


        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i<n; ++i){
            st = new StringTokenizer(br.readLine());
            list.add(st.nextToken());
        }
        list.sort(lengthComparator);

        System.out.println(list);
    }
}
