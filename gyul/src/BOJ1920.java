import java.io.*;
import java.util.*;

public class BOJ1920 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int arr1[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            arr1[i] = n;
        }

        Arrays.sort(arr1);

        int M = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            int n = Integer.parseInt(st2.nextToken());

            // 이진탐색을 해서 찾지 못했을 경우, 음수를 반환
            int result = Arrays.binarySearch(arr1, n);

            if(result < 0){
                sb.append(0 + "\n");
            }
            else{
                sb.append(1 + "\n");
            }
//            for(int j = 0; j < N; j++){
//                if(n == arr1[j]){
//                    sb.append(1 + "\n");
//                    break;
//                }
//
//                if(j == (N - 1)){
//                    sb.append(0 + "\n");
//                }
//
//            }
        }

        System.out.println(sb);
    }
}
