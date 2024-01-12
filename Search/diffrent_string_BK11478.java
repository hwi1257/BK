package Search;

import java.util.Scanner;
import java.util.HashSet;


public class diffrent_string_BK11478 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String>hashSet = new HashSet<String>();

        String string = in.next();
        in.nextLine();

        // 문자열 값 입력


        for(int i = 0; i<string.length(); ++i){
            for(int j = i; j<=string.length(); ++j){
                  hashSet.add(string.substring(i,j));
            }
        }
        System.out.println(hashSet.size()-1);
    }
}
