import java.util.*;
import java.io.*;

/**
 * 큐를 연습하는 문제였겠지만... 그냥 규칙을 찾아 그대로 출력하면 훨씬 효율적이다.
 */
public class BOJ2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 1;
        if(N != 1) {
            while (true) {
                if (N <= Math.pow(2, num)) {
                    int total = (int) Math.pow(2, num);
                    System.out.println(total - 2 * (total - N));
                    break;
                }
                num++;
            }
        }
        else{
            System.out.println(1);
        }
    }
}
