import java.util.*;
import java.io.*;

/**
 * 블랙잭 문제로, 세가지 카드를 골라 그 합이 목표치에 근사하도록 만드는 문제.
 * 간단히 삼중 반복문으로 경우의 수를 구했다.
 * 세가지 카드를 고르라는 조건이 없다면 조금 귀찮게 조합을 구해야 하는 문제였다.
 */
public class BOJ2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        int value = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i<N-2; i++){
            sum += arr[i];
            if(sum > M){
                sum -= arr[i];
                continue;
            }
            for(int j=i+1; j<N-1; j++){
                sum += arr[j];
                if(sum > M){
                    sum -= arr[j];
                    continue;
                }
                for(int k=j+1; k<N; k++){
                    sum += arr[k];
                    if(sum > M){
                        sum -= arr[k];
                        continue;
                    }
                    // 비교
                    if(M-sum < value){
                        value = M-sum;
                        answer = sum;
                    }
                    sum -= arr[k];
                }
                sum -= arr[j];
            }
            sum = 0;
        }
        System.out.println(answer);
    }
}
