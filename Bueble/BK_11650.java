package Bueble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class xy{
    String x1;
    String y1;

    int x1y1;

    public xy(String x1,String y1){
        this.x1 = x1;
        this.y1 = y1;
        this.x1y1 = ca(x1,y1);
    }

    private int ca(String x1, String y1){
        int x = Integer.parseInt(x1);
        int y = Integer.parseInt(y1);

        return x+y;
    }
    public String toString() {
        return x1 + " " + y1 ;
    }


}

public class BK_11650 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        xy[] arr = new xy[n];
        for(int i = 0 ; i<n; ++i){
            st = new StringTokenizer(br.readLine());
            String x1 = st.nextToken();

            String y1 = st.nextToken();

            arr[i] = new xy(x1,y1);
        }
        Arrays.sort(arr, (c1, c2) -> Integer.compare(c1.x1y1, c2.x1y1));

        for(int i = 0 ; i<n; ++i){
            System.out.println(arr[i]);
        }
    }
}
