import java.util.*;
import java.io.*;

/**
 * 에라토스테네스의 체를 사용하는 문제~
 */
public class BOJ1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[] notPrimeArr = new boolean[1001];
        notPrimeArr[0] = true;
        notPrimeArr[1] = true;

        for(int i=2; i<1001; i++){
            if(!notPrimeArr[i]){
                for(int j=2*i; j<1001; j+=i){
                    notPrimeArr[j] = true;
                }
            }
        }

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int answer = 0;
        for(int i=0; i<N; i++){
            if (!notPrimeArr[Integer.parseInt(st.nextToken())]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
