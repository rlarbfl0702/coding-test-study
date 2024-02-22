import java.util.*;
import java.io.*;

public class BOJ1546 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        float scores[] = new float[N];
        float max_score = Integer.MIN_VALUE;
        float total_score = 0;
        float result = 0;

        for(int i = 0; i < N; i++){
            int M = Integer.parseInt(st.nextToken());
            scores[i] = M;
        }

        for(float i : scores){
            if(i > max_score){
                max_score = i;
            }
        }

        for(int i = 0; i < scores.length; i++){
            float score = (scores[i]/max_score)*100;
            total_score = total_score + score;
        }

        result = total_score/N;

        System.out.println(result);
    }
}
