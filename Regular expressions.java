import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Regular Expressions Shorthand Character Sets

        \\d    Digit [0-9]
        \\D    Non-digit [^0-9]
        \\w    Alphanumeric character [a-zA-Z0-9_]
        \\W    Non-alphanumeric character [^a-zA-Z0-9_]
        \\s    Whitespace character [\t\n\r]
        \\S    Non-whitespace [^\\s]


        Dot(.)           . is used to get one word before dot(.) except \n with all after it
        Question(?)      ? is used to represent (Optional) zero or one repeated character(s) before it
        Plus(+)          + is used to represent more like that preceding it
        Asterisk(*)      * is used to get zero or one repetition character(s)
        Pipe(|)          | is used to represent connectivity with other character(s)

        ()               Parentheses() means gets the value from the parentheses
        []               Square Brackets[] means only one digit inside it like [0-9] or [a-z]


*/

public class Jp {

    public static void main(String[] args){

        // All regular expression patterns will work in place of "Hello"
        

        Pattern regex_pattern = Pattern.compile("Hello", Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex_pattern.matcher("Hello World");
        boolean match = matcher.find();

        if(match){
            System.out.println("Matched");
        }else{
            System.out.println("Matching text is unavailable");
        }


    }

}

class Regex{

    public String phone_number_pattern(String str){

        Pattern pat = Pattern.compile("(\\+\\d\\d)?\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        Matcher match = pat.matcher(str);

        StringBuilder x = new StringBuilder();

        while (match.find()){
            System.out.println("Pattern found from " + match.start() + " to " +  (match.end()-1));
            x.append(str.substring(match.start(), match.end()-1));
            x.append("\n");
        }

        return x.toString();
    }

    public String email_pattern(String str){

        Pattern pat = Pattern.compile("(\\w+@\\w+)((.\\w+.\\w+.\\w+)|(.\\w+.\\w+)|(.\\w+))");
        Matcher match = pat.matcher(str);

        StringBuilder x = new StringBuilder();

        while (match.find()){
            x.append(str.substring(match.start(), match.end()));
            x.append("\n");
        }

        return x.toString();
    }

}
