import java.io.*;
import java.util.*;

public class BOJ1676 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt_2 = 0;
        int cnt_5 = 0;

        for (int i = 1; i <= N; i++) {
            int n = i;
            while(true){
                boolean f = false;
                boolean t = false;

                if(n % 5 == 0){
                    cnt_5 = cnt_5 + 1;
                    n = n / 5;
                    f = true;
                }

                if(n % 2 == 0){
                    cnt_2 = cnt_2 + 1;
                    n = n / 2;
                    t = true;
                }

                if(f == false && t == false){
                    break;
                }
            }
        }

        System.out.println(cnt_5);

    }
}
