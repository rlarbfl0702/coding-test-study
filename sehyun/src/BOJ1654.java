import java.util.*;
import java.io.*;

/**
 * 토나오는 이분탐색.
 * 0으로 시작했을 땐 틀리고 1로 시작하면 맞다니...
 * 거기다 integer 범위를 초과하는 테스트 케이스를 생각해야 한다.
 */
public class BOJ1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] arr = new long[K];
        long maxValue = Integer.MIN_VALUE;

        for(int i=0; i<K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            maxValue = Math.max(maxValue, arr[i]);
        }

        long left = 1;
        long right = maxValue;

        if(N == 1){
            System.out.println(maxValue);
        }
        else {
            while (left <= right) {
                long mid = (left + right) / 2;
                long cnt = 0;
                for (int i = 0; i < K; i++) {
                    cnt += arr[i] / mid;
                }
                if (cnt >= N) {
                    // left를 mid로 이동
                    left = mid + 1;
                } else {
                    // right를 mid로 이동
                    right = mid - 1;
                }
            }

            if (right < 0) {
                right = 0;
            }
            System.out.println(right);
        }

    }
}
