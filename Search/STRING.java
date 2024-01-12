package Search;

import java.util.Scanner;
import java.util.Comparator;
import java.util.HashSet;

public class STRING {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> stringHashSet = new HashSet<String>();

        String[] inputSizes = in.nextLine().split(" ");

        int n = Integer.parseInt(inputSizes[0]);

        // 첫번째 문자열 크기
        int num = Integer.parseInt(inputSizes[1]);

        // 두번째 문자열 크기

        for(int i = 0; i<n; ++i){
            stringHashSet.add(in.nextLine().trim());
        }
        int count = 0;

        for(int i = 0; i<num; ++i){
            if(stringHashSet.contains(in.nextLine().trim()))

            count++;
        }

        System.out.println(count);
    }
}
