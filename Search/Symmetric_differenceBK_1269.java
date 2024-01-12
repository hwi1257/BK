package Search;

import java.util.Scanner;
import java.util.HashSet;
public class Symmetric_differenceBK_1269 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String>hashSet = new HashSet<String>();
        int n = Integer.parseInt(in.next());
        int n2 = Integer.parseInt(in.next());

        for(int i = 0; i<n; ++i){
            hashSet.add(in.next());

        }
        int count = 0;

        for(int i = 0; i<n2; ++i){
            String string = in.next();
            if(hashSet.contains(string)){
                count++;
            }
            hashSet.add(string);
        }

        System.out.println(hashSet.size()-count);



    }
}
