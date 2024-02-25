import java.util.*;
import java.io.*;

/**
 * 단순히 큐에 데이터를 넣고 빼고 하는 문제.
 * 현재 빠져야 하는 우선수위 값을 또 다른 우선순위 큐에 저장해놓는게 편하다.
 */
public class BOJ1966 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int test_case = Integer.parseInt(br.readLine());


        for(int i=0; i<test_case; i++){
            int answer = 0;
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            Deque<int[]> queue = new ArrayDeque<>();
            Queue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<cnt; j++){
                int priority = Integer.parseInt(st.nextToken());
                pQueue.add(priority);
                queue.addLast(new int[]{j, priority});
            }
            while(true){
                if(queue.peekFirst()[1] == pQueue.peek()){
                    int num = queue.removeFirst()[0];
                    pQueue.poll();
                    answer++;
                    if(num == target){
                        sb.append(answer).append('\n');
                        break;
                    }
                }
                else{
                    queue.addLast(queue.removeFirst());
                }
            }
        }
        System.out.println(sb);
    }
}
