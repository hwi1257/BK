package for_char;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int index = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i<index; ++i) {
            String a = scanner.nextLine();

            System.out.println("" + a.charAt(0)+a.charAt(a.length()-1));


        }

    }
}
