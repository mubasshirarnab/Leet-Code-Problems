package MediumProblems;

import java.util.Collections;
import java.util.Stack;

public class Solution2 {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String str2 = "";
//        for (int i = str.length-1; i >= 0; i--){
//            str2 = str2 + str[i];
//            if (i!=0){
//                str2 = str2 + " ";
//            }
//        }
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length; i++){
            if (!str[i].equals("")){
                stack.push(str[i]);
            }
        }
        int x = stack.size();
        while (!stack.empty()){
            str2 = str2 + stack.pop();
            if (x!=1){
                str2 = str2 + " ";
            }
            x--;
        }

        return str2;
    }
}

class Check{
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.reverseWords(" a good  example"));
    }
}
