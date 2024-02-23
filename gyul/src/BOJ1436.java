import java.io.*;
import java.util.*;

public class BOJ1436 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 1;

        for(int i = 0; i <= Integer.MAX_VALUE/100; i++){
            String number = i + "";
            String n = i + "";

            if(number.contains("666")){
                cnt = cnt + 1;

            }

            if(cnt - 1 == N){
                System.out.println(i);
                break;
            }
        }
    }
}
