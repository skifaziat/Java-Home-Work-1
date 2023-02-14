public class task1{
    public static boolean isPalindrome(String str) {
            str = str.replaceAll("\\s", "");
            String reverseStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                     reverseStr += str.charAt(i);
            }
            return str.equals(reverseStr);
            }
}