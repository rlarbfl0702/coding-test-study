import java.io.*;

/**
 * 첫번쨰 숫자와 마지막 숫자를 비교하는 등, 양파 껍질을 벗기듯이 벗겨나가면 된다.
 * 중간에 일치하지 않으면 그 숫자는 팰린드롬이 아님!
 */
public class BOJ1259 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String number = br.readLine();
            if(number.equals("0")){
                break;
            }
            boolean flag = false;
            for(int i=0; i<number.length()/2; i++){
                if(number.charAt(i) != number.charAt(number.length()-1-i)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                sb.append("no");
            }
            else{
                sb.append("yes");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
