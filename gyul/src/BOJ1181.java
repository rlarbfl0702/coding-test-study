import java.io.*;
import java.util.*;

public class BOJ1181 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String words[] = new String[N];
        TreeSet<String> answer = new TreeSet<>();

        for(int i = 0; i < N; i++){
            String word = "";

            word = br.readLine();

            words[i] = word;

        }

        int cnt =  0;

        for(int i = 0; i < N; i++){
            answer.add(words[i]);
        }

        String no_same_words[] = new String[answer.size()];

        for(String a: answer){
            no_same_words[cnt] = a;
            cnt = cnt + 1;
        }

        for(int i = 0; i < no_same_words.length; i++){
            for(int j = i; j < no_same_words.length; j++){
                if(no_same_words[i].length() > no_same_words[j].length()){
                    String s1 = no_same_words[i];
                    no_same_words[i] = no_same_words[j];
                    no_same_words[j] = s1;
                }
                else if(no_same_words[i].length() == no_same_words[j].length()){
                    String s1 = no_same_words[i];
                    String s2 = no_same_words[j];

                    if(s1.compareTo(s2) > 0){
                        no_same_words[i] = s2;
                        no_same_words[j] = s1;
                    }
                }
            }
        }

        for(int i = 0; i < no_same_words.length; i++){
            System.out.println(no_same_words[i]);
        }
    }
}
