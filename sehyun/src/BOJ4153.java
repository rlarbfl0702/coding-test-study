import java.util.*;
import java.io.*;

/**
 * 직각 삼각형인지를 체크하는 문제.
 * 그냥 정렬 후 제곱해서 값을 비교하면 끝.
 */
public class BOJ4153 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            int[] arr = new int[3];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int sum = 0;
            for(int i=0; i<3; i++){
                sum += arr[i];
            }
            if(sum == 0){
                break;
            }
            Arrays.sort(arr);
            if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)){
                sb.append("right").append('\n');
                continue;
            }
            sb.append("wrong").append('\n');
        }
        System.out.println(sb);
    }
}
