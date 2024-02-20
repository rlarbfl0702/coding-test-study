import java.util.*;
import java.io.*;

/**
 * 슬라이딩 윈도우 처럼 윈도우를 이동 시켜가면서 해당 위치의 문자가 일치하는지에 따라 카운트를 각각 증가시켜 최솟값을 찾는다.
 * 핵심은 다음 줄의 요소를 비교할 때마다 기준값이 되는 문자가 바뀐다는 점.
 */
public class BOJ1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char mtrx[][] = new char[N][M];
        for(int i=0; i<N; i++){
            mtrx[i] = br.readLine().toCharArray();
        }

        int cnt_min = Integer.MAX_VALUE;
        char start = ' ';
        char start2 = ' ';

        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                int count1 = 0;
                int count2 = 0;
                for(int x=0; x<8; x++){
                    if(x%2==0){
                        start = 'W';
                        start2 = 'B';
                    }
                    else{
                        start = 'B';
                        start2 = 'W';
                    }
                    for(int y=0; y<8; y++){
                        if(y%2==0){
                            if(mtrx[i+x][j+y] != start){
                                count1++;
                            }
                            else if(mtrx[i+x][j+y] != start2){
                                count2++;
                            }
                        }
                        else{
                            if(mtrx[i+x][j+y] == start){
                                count1++;
                            }
                            else if(mtrx[i+x][j+y] == start2){
                                count2++;
                            }
                        }
                    }
                }
                cnt_min = Math.min(cnt_min, count1);
                cnt_min = Math.min(cnt_min, count2);
            }
        }
        System.out.println(cnt_min);
    }
}