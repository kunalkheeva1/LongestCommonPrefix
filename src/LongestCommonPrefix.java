import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String [] str){

        //get the variable in string builder to append the characters in the string builder
        StringBuilder result = new StringBuilder();
        //sort the array so the same elements can come in sequence wise
        Arrays.sort(str);
      //change the string of first string to array of characters
        char [] first = str[0].toCharArray();
        //same applies to last string
        char [] last = str[str.length - 1].toCharArray();
        //run a loop thru first element of string(array of characters now)
        for(int i= 0; i<first.length; i++){
            //if characters are not similar then break the loop
            if(first[i]!=last[i])
                break;
            //else append the founded elements
            result.append(first[i]);
            //retrun the result using toString method.
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
