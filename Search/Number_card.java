package Search;

import java.util.Scanner;

import java.util.Comparator;
import java.util.HashSet;


public class Number_card {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<String>();

        int n = in.nextInt();
        in.nextLine();


        for(int i = 0; i<n; ++i){
            hashSet.add(in.next());
        }

        int num = in.nextInt();
        in.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<num; ++i){
            if(hashSet.contains(in.next())){
                sb.append(1+" ");
            }
            else{
                sb.append(0+" ");
            }
        }
        System.out.println(sb);

    }

}
