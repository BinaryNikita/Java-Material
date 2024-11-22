package RegularExpression;

/*
 * Regular expressions, often abbreviated as regex 
 * or regexp, are a powerful tool for pattern matching
 *  and text manipulation. In Java, regular expressions 
 * are supported through the java.util.regex package, 
 * which includes the Pattern and Matcher classes.

Key Concepts
Pattern: A compiled representation of a regular expression.
Matcher: An engine that performs match operations on a character
 sequence by interpreting a Pattern.
 */

import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        String pattern = "quick";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Match found at index: " + matcher.start());
        } else {
            System.out.println("Match not found");
        }
    }
}



 class RegexExample2 {
    public static void main(String[] args) {
        String input = "hello123world";
        String pattern = "\\w+\\d+\\w+";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        } else {
            System.out.println("Match not found");
        }
    }
}





 class EmailValidator {
    public static void main(String[] args) {
        String email = "exampleexample.com";
        String emailPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }
}

