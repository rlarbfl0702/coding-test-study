import java.util.*;
import java.io.*;

/**
 * 스택을 쓰는 문제.
 * 예외처리만 잘 하면 매우매우 쉽다.
 */
public class BOJ4949 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }
            Deque<Character> stack = new ArrayDeque<>();
            boolean flag = false;
            loop: for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                switch (c){
                    case '(':
                    case '[':
                        stack.addLast(c);
                        break;
                    case ')':
                        if(stack.isEmpty() || stack.removeLast() != '(') {
                            flag = true;
                            break loop;
                        }
                        break;
                    case ']':
                        if(stack.isEmpty() || stack.removeLast() != '[') {
                            flag = true;
                            break loop;
                        }
                        break;
                }
            }
            if(flag){
                sb.append("no").append('\n');
                continue;
            }
            if(stack.isEmpty()){
                sb.append("yes").append('\n');
            }
            else{
                sb.append("no").append('\n');
            }
        }
        System.out.println(sb);
    }
}
