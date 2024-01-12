package for_char;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        int[] arr2;
        arr2 = new int[num];

        for (int i = 0; i < num; ++i){
            int n = scanner.nextInt();
            arr2[i] = n;
        }
        int max = -10000001;
        int min = 10000001;
        for (int i = 0; i < num; ++i){
            if(arr2[i] >= max) {
                max = arr2[i];
            }
            if(arr2[i] <= min){
                min = arr2[i];
            }
        }

        System.out.println(min+" "+max);
    }
}
