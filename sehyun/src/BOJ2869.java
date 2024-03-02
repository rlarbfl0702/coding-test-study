import java.util.*;
import java.io.*;

/**
 * 그리디 문제..? 단순 시뮬레이션을 돌리기에는 10억이란 숫자는 너무 컸다...
 * 어차피 오르고 미끄러지는 과정이 반복되므로, 하루(낮, 밤 포함)동안 오를 수 있는 거리로 먼저 목표치의 근삿값까지 얼마나 걸리는지 구한다.
 * 이렇게 해서 최대한 반복 횟수를 줄여 시간을 절약하고, 나머지는 시뮬레이션으로 돌린다.
 */
public class BOJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int answer = (V-A)/(A-B)-1;
        if(answer <= 0){
            answer = 1;
        }
        while(true){
            if(A*answer - B*(answer-1) >= V){
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
