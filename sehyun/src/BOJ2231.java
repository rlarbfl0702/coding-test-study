import java.util.*;
import java.io.*;

/**
 * 모든 자릿수를 합했을 때 특정 값이 나오는 최소의 수를 구하는 문제.
 * 숫자를 문자열로 변환하고, 각 자릿수를 문자로 변환 후 합을 구해 찾는다.
 */
public class BOJ2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=0; i<N; i++){
            String str = i+"";
            int sum = 0;
            for(int j=0; j<str.length(); j++){
                sum += str.charAt(j)-'0';
            }
            sum += i;
            if(sum == N){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
