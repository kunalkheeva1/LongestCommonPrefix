import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String [] str){
        StringBuilder result = new StringBuilder();
        Arrays.sort(str);

        char [] first = str[0].toCharArray();
        char [] last = str[str.length - 1].toCharArray();

        for(int i= 0; i<first.length; i++){
            if(first[i]!=last[i])
                break;

            result.append(first[i]);
        }  return result.toString();
    }
    //above method did not work so I am trying to use another method anyhow both differ with time and space complexity
//    public String longestCommonPrefix1(String[]str){
//
//    }
    public static void main(String[] args) {
        String [] str = {"Kunal","Kuna","kunnu"};



    }
}
