package Bueble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BK1181_1 {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> words = new ArrayList<>();

        Set<String> set = new HashSet<>();

        for(int  i = 0; i<n; ++i){
            String word = scanner.nextLine();

            if(set.add(word)){
                words.add(word);
            }

        }
        Collections.sort(words, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // 길이가 같으면 사전 순으로 정렬
            }
            return Integer.compare(a.length(), b.length()); // 길이가 다르면 길이에 따라 정렬
        });//Integer.compare 길이 비교메서드
        //return a.compareTo(b) 사전수 비교 메서드

        // 정렬된 단어들 출력
        for (String word : words) {
            System.out.println(word);
        }

    }
}
