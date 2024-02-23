import java.util.*;
import java.io.*;

/**
 * 단순 스택에 push, pop을 하는 문제인데 너무 헷갈렸다.
 * 지금은 항상 모든 숫자가 나온다는 보장이 있지만, 만약 그런 조건이 사라진다면... 두렵다.
 */
public class BOJ1874 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        int now = 0;

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());

            if(num > now){
                for(int j=now+1; j<num+1; j++){
                    stack.addLast(j);
                    sb.append('+').append('\n');
                }
                now = num;
            }
            else if(stack.peekLast() != num){
                sb.setLength(0);
                sb.append("NO");
                break;
            }
            sb.append('-').append('\n');
            stack.removeLast();
        }
        System.out.println(sb);
    }
}