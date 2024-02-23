import java.util.*;
import java.io.*;

/**
 * 이분탐색 v2...
 * 카운팅 소트를 쓰려했지만 범위가 너무 넓어 불가능했다.
 * 포인트는 while 반복문의 기저조건!
 */
public class BOJ1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] numArr = new int[N];
        for(int i=0; i<N; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<M; i++){
            int num = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = N-1;
            boolean flag = false;
            while(left <= right){
                int mid = (left + right)/2;
                if(numArr[mid] > num){
                    right = mid-1;
                }
                else if(numArr[mid] < num){
                    left = mid+1;
                }
                else{
                    flag = true;
                    break;
                }
            }
            if(flag){
                sb.append(1);
            }
            else{
                sb.append(0);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
