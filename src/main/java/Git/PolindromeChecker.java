package Git;

public class PolindromeChecker {
    static boolean checkPalindrome (String stringToCheck) {
        String stringToCheckFix = StringUtils.stringUtils(stringToCheck);
        int length = stringToCheckFix.length();
        char[] charTable = stringToCheckFix.toCharArray();
        String string = "";
        for (int i = length; i > 0; i--) {
            string += charTable[i-1];
        }
        return (stringToCheckFix.equals(string));
    }
}
