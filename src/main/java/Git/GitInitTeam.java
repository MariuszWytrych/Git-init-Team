package Git;

public class GitInitTeam {
    public static void main(String[] args) {
        String stringToCheck = "Kobyła ma mały bok.";
        String stringToCheck1 = "Kobyła ma mały w bok.1";
        String stringToCheck2 = "Ala!!";
        String stringToCheck3 = "KaJaK@";

        System.out.println(PolindromeChecker.checkPalindrome(stringToCheck));
        System.out.println(PolindromeChecker.checkPalindrome(stringToCheck1));
        System.out.println(PolindromeChecker.checkPalindrome(stringToCheck2));
        System.out.println(PolindromeChecker.checkPalindrome(stringToCheck3));

    }
}
