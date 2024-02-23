import java.io.*;
import java.util.*;

public class BOJ1654 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long max_line = 0;

        int line[] = new int[K];

        for(int i = 0; i < K; i++){
            int l = Integer.parseInt(br.readLine());

            if(l > max_line){
                max_line = l;
            }
            line[i] = l;
        }

        long mid = 0;
        long min = 0;

        // 랜선의 길이가 모두 1일 경우, max = 1이되고
        // min은 초기값으로 0을 갖게 되며 mid = (max + min)/2로, mid = (0 + 1)/2 = 0이 됨
        // 따라서 mid로 나누는 식은 0으로 나누는 식이 되어버리므로 1을 더해줘야됨
        max_line = max_line + 1;

        while(min < max_line){
             mid = (max_line + min) / 2;

            long total_cnt = 0;

            for(int j = 0; j < K; j++){
                total_cnt = total_cnt + (line[j] / mid);
            }

            // 만약 카운트된게 라인 개수보다 작다면 랜선 길이가 더 작아야되니까
            if(total_cnt < N){
                max_line = mid;
            }
            // 생성해야되는 라인 개수보다 같거나 많다면 랜선 길이가 충분하다는 의미,
            // 즉 랜선 길이를 좀 더 늘려도 된다는 의미
            // 이런식으로 최솟값을 계속 늘리면서 최대 랜선 길이를 찾음
            // min이 max보다 커지게 되면 while문이 종료되므로 최대 랜선 길이를 찾을 수 있음
            else{
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}
