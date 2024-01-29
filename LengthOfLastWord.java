package EasyProblems;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s)
    {
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }
}

class Check2{
    public static void main(String[] args) {
        LengthOfLastWord l1 = new LengthOfLastWord();
        System.out.println(l1.lengthOfLastWord("Hello World  "));
    }
}
