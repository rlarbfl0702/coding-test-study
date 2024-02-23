import java.util.*;
import java.io.*;

/**
 * 심플한 소수 구하기 문제.
 * 당연히 에라토스테네스의 체를 사용하는게 정신건강에 좋다.
 */
public class BOJ1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        if(M == 1){
            M += 1;
        }

        boolean[] sosu = new boolean[N + 1];
        for(int i=2; i<N+1; i++){
            if(!sosu[i]){
                for(int j=2*i; j<N+1; j+=i){
                    sosu[j] = true;
                }
            }
        }
        for(int i=M; i<N+1; i++){
            if(!sosu[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
