import java.util.*;
import java.io.*;

/**
 * 수를 오름차순으로 정렬하는 문제.
 * 카운팅 정렬을 사용한다.
 */
public class BOJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[2_000_001];

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num+1_000_000] = true;
        }

        for(int i=0; i<2_000_001; i++){
            if(arr[i]){
                sb.append(i-1_000_000).append('\n');
            }
        }
        System.out.println(sb);
    }
}
