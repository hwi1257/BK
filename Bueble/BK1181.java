package Bueble;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BK1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 단어의 개수 입력
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        // 단어를 저장할 리스트 생성
        List<String> words = new ArrayList<>();

        // 단어 입력 및 중복 제거를 위한 Set 생성
        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();

            // 중복된 단어는 Set에 추가하지 않음
            if (wordSet.add(word)) {
                words.add(word);
            }
        }

        // 길이에 따라 정렬
        Collections.sort(words, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // 길이가 같으면 사전 순으로 정렬
            }
            return Integer.compare(a.length(), b.length()); // 길이가 다르면 길이에 따라 정렬
        });

        // 정렬된 단어들 출력
        for (String word : words) {
            System.out.println(word);
        }
    }
}
