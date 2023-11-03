public class Solution {
    public void strStr(String haystack, String needle) {
        int flag = 0, index = 0;
        if(haystack.length() == 1){
            System.out.println("0");
        }
        else {
            for (int i = 0; i < haystack.length(); i++){
                for (int j = i; j < haystack.length() + 1; j++){
                    String s = haystack.substring(i, j);
                    if (s.equals(needle)){
                        flag = 1;
                        index = i;
                        break;
                    }
                    if (flag == 1){
                        break;
                    }
                }
            }
            if (flag == 1){
                System.out.println(index);
            }else {
                System.out.println("-1");
            }
        }
        }
}

class Main100{
    public static void main(String[] args) {
        Solution s = new Solution();
        s.strStr("sadbutsad", "sad");
    }
}
