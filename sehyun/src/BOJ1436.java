import java.util.*;
import java.io.*;

/**
 * 그리디로는 너무 어렵고, 단순 브루트포스로 접근해서 666이 포함된 숫자를 찾을 때 마다 카운트를 증가시켜 해당 순서에 있는 숫자를 출력한다.
 */
public class BOJ1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        int cnt = 0;
        while (cnt != N) {
            answer++;
            String tmp = "" + answer;
            if (tmp.contains("666")) {
                cnt++;
            }
        }
        System.out.println(answer);
    }
}
