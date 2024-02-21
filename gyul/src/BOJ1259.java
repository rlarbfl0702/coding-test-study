import java.io.*;
import java.util.*;

public class BOJ1259 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){

            String p = br.readLine();
            int p_l = p.length();
            if(p.equals("0")){
                break;
            }

            if(p_l == 1){
                sb.append("yes \n");
            }

            if(p_l >= 2){
                for(int i = 0; i < p_l/2; i++){
                    if(!p.split("")[i].equals(p.split("")[p_l - i - 1])){
                        sb.append("no \n");
                        break;
                    }

                    if(i == (p_l/2 - 1)){
                        sb.append("yes \n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}
