package Bueble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BK_LJH10814 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n  = in.nextInt();

        Person[] p  = new Person[n];
        // 객체형 배열 p 선언!

        for(int i = 0; i<n; ++i){
            p[i] = new Person(in.nextInt(), in.next());
        }

        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person s1, Person s2) {
                return s1.old - s2.old;
            }
        });


        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<n; ++i){
            sb.append(p[i]);
        }

        System.out.println(sb);


    }

    public static class Person{
        int old;

        String string;

        public Person(int old, String string){
            this.old = old;
            this.string = string;
        }
        public String toString() {
            return old + " " + string + "\n";
        }
    }
}
