import java.util.*;
import java.io.*;

/**
 * 피보나치 수열...이랄까.. 아무튼 아랫층의 이전 호수 인원을 누적해서 더해야 하는 문제.
 * 이차원 배열을 쓰기 싫어 일차원으로 배열을 사용해 인덱스별로 각 층을 나눴다.
 * 가장 쉬운 DP 문제이다.
 */
public class BOJ2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[211];

        for(int i=0; i<15; i++){
            arr[i] = i;
        }
        for(int i=1; i<15; i++){
            arr[i*14 + 1] = arr[(i-1)*14+1];
            for(int j=0; j<14; j++){
                int sum = 0;
                for(int k=0; k<j+1; k++){
                    sum += arr[(i-1)*14+1+k];
                }
                arr[i*14+1 + j] = sum;
            }
        }

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[14 * (k) + n]).append('\n');
        }
        System.out.println(sb);
    }
}
