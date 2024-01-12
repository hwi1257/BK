package Search;
import java.util.*;
import java.util.Scanner;
import java.util.TreeSet;

public class BK_1764_nosee_nolis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<String> hashSet = new TreeSet<String>();

        int n = Integer.parseInt(in.next());  // 첫 번째 정수 입력

        long n2 = Long.parseLong(in.next());  // 두 번째 정수 입력


        for(int i = 0; i<n; ++i){
            String name = in.next();

            hashSet.add(name);

        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        ArrayList<String> array=new ArrayList<>();

        for(int i = 0; i<n2; ++i){
            String name = in.next();

            boolean contains = hashSet.contains(name);
            if(hashSet.contains(name)){
                array.add(name);
            }
        }


        Collections.sort(array);
        System.out.println(array.size());

        for(String str:array){
            System.out.println(str);
        }
        in.close();
    }
}
