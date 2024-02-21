import java.util.*;
import java.io.*;

/**
 * 그냥 팩토리얼에 곱해지는 수 중 5가 몇개인지 체크하는 문제.
 * 함정은 25와 125, 제곱수에 있다.
 */
public class BOJ1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        if(N!=0) {
            for (int i = 1; i < N+1; i++) {
                if (i % 5 == 0) {
                    int tmp = i;
                    while (tmp % 5 == 0) {
                        answer++;
                        tmp /= 5;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
