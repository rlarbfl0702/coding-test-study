import java.util.*;
import java.io.*;

/**
 * 단순 수열 문제.
 */
public class BOJ2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 1;
        if(N > 1) {
            int cmp = 2;
            while (true) {
                if(N >= cmp){
                    cmp += 6*answer;
                    answer++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
