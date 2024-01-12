package Search;

import java.util.Scanner;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
public class Company {

    public static void main(String[] args) {

        TreeSet<String> animals1 = new TreeSet<String>((o1, o2) -> o2.compareTo(o1)); // 역순으로 정렬
        // TreeSet = 사전순으로 정렬
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();


        for(int i =0; i<n; ++i){

            String b = in.next();
            animals1.add(b);

            String a = in.nextLine().trim();

            if (a.equals("leave")) {
                animals1.remove(b);
            }

        }
        for (String animal : animals1) {
            System.out.print(animal + "\n");
        }

    }
}
