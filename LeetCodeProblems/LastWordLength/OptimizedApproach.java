package LastWordLength;

public class OptimizedApproach {
    public int lengthOfLastWord(String s) {

        int length = 0, tailPos = s.length()-1;
        while(tailPos >= 0 && s.charAt(tailPos) == ' '){
            tailPos--;
        }
        while(tailPos >= 0 && s.charAt(tailPos) != ' '){
            length++;
            tailPos--;
        }
        return length;
    }

    public static void main(String[] args) {
        OptimizedApproach obj = new OptimizedApproach();
        System.out.println(obj.lengthOfLastWord(" "));
    }
}
