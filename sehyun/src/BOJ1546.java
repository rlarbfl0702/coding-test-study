import java.util.*;
import java.io.*;

/**
 * 심플한 문제 ~
 */
public class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        float[] numArr = new float[N];
        float M = Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
            M = Math.max(M, numArr[i]);
        }
        float avg = 0;

        for(int i=0; i<N; i++){
            numArr[i] = numArr[i]/M*100;
            avg += numArr[i];
        }
        System.out.println(avg/N);
    }
}
