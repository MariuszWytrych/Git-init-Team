package Git;

public class PolindromeChecker {
    static boolean checkPalindrome (String stringToCheck) {
        String stringToCheckFix = StringUtils.prepareString(stringToCheck);
//        int length = stringToCheckFix.length();
        char[] charTable = stringToCheckFix.toCharArray();
        String string = "";
//        for (int i = charTable.length; i > 0; i--) {
//            string += charTable[i-1];
//        }
        for ( int i = 0; i < charTable.length; i++){
            string += charTable[charTable.length -1 - i];
        }
        return (stringToCheckFix.equals(string));
    }
}
