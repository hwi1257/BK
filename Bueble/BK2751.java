package Bueble;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class BK2751 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = a.nextInt();

        // list 계열 중 하나를 쓰면 된다.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(a.nextInt());
        }

        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}