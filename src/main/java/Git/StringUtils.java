package Git;

public class StringUtils {
    String stringUtils (String stringToCheck){
        String string = stringToCheck;
        string = string.replaceAll(" ","");
        string = string.replaceAll(".","");
        string = string.replaceAll(",","");
        string = string.toLowerCase();

        return string;
    }
}
