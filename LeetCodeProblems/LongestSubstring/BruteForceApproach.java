package LongestSubstring;

public class BruteForceApproach {

    public static void main(String[] args) {
        System.out.println(getMaxSubstringLength("bbb"));
    }

    private static int getMaxSubstringLength(String s) {
        String subStr = "";
        int i=0, lookupPos = 0, maxLength = 0;
        String ch;
        while(i!=s.length()){
            ch = String.valueOf(s.charAt(i));
            if(!subStr.contains(ch)){
                subStr = subStr.concat(ch);
                i++;
            }
            else{
                lookupPos = lookupPos+1;
                i = lookupPos;
//                System.out.println(i);
                subStr = "";

            }
            if(subStr.length() > maxLength){
                maxLength = subStr.length();
            }
//            System.out.println(subStr);
        }
        return maxLength;
    }
}
