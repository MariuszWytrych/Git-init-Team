package Git;

public class StringUtils {
    static String prepareString (String stringToBePrepared){
        String string = stringToBePrepared.replaceAll("[\\W\\s\\d_]+","").toLowerCase();
//        string = string.replaceAll("[^\\w]","").toLowerCase();
//        string = string.replaceAll(".","");
//        string = string.replaceAll(",","");
//        string = string.toLowerCase();

        return string;
    }
}
