package Bueble;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class BK_10814 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        Person[] p = new Person[N];
        // 객체형 배열 p선언

        for(int i = 0; i < N; i++) {
            p[i] = new Person(in.nextInt(), in.next());
            // Person 의 객체를 생성하고 값 저장
        }

        Arrays.sort(p, new Comparator<Person>() {
            // 나이순으로 정렬
            @Override
            public int compare(Person s1, Person s2) {
                return s1.age - s2.age;
            }

        });

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            // 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
            sb.append(p[i]);
        }

        System.out.println(sb);

    }
    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }

}

