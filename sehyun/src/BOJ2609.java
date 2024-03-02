import java.util.*;
import java.io.*;

/**
 * 최대공약수, 최소공배수를 구하는 문제.
 * 유클리드호제법을 사용하면 된다.
 */
public class BOJ2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int big = Math.max(a,b);
        int small = Math.min(a,b);

        while(small > 0){
            int tmp = big%small;
            big = small;
            small = tmp;
        }
        System.out.println(big);
        System.out.println(a*b/big);
    }
}
