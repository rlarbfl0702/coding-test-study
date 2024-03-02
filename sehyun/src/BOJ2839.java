import java.util.*;
import java.io.*;

/**
 * 전형적인 그리디 문제.
 * 무조건적으로 5로 최대한 할당하는 것이 정답이므로, 5로 나눌 수 있으면 나누고 나머지는 3으로 채운다.
 */
public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        while(N>0){
            if(N%5 == 0){
                answer += N/5;
                break;
            }
            else{
                N-=3;
                answer++;
            }
        }
        if(N<0){
            answer = -1;
        }
        System.out.println(answer);
    }
}
