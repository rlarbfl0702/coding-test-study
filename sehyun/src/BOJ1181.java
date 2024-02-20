import java.util.*;
import java.io.*;

/**
 * 트리셋으로 중복을 제거하고 comparator를 사용해 순서를 정렬하자.
 */
public class BOJ1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new TreeSet<>();

        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }
        List<String> strList = new ArrayList<>(set);

        strList.sort((s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            else {
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        return s1.charAt(i) - s2.charAt(i);
                    }
                }
            }
            return 0;
        });

        for(String str: strList){
            sb.append(str);
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
