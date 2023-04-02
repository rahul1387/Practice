import java.sql.SQLOutput;
import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {

        String name = "Neeraj";
        System.out.println();

//        int value = name.length();
//        System.out.println(value);


//        String Lowercase=name.toLowerCase();
//        System.out.println(Lowercase);

//        String Uppercase=name.toUpperCase();
//        System.out.println(Uppercase);

//        String nontrimmedString= "           Neeraj          ";
//        System.out.println(nontrimmedString .trim());

//        System.out.println(name.substring(5));
//        System.out.println(name.substring(1,3));

//        System.out.println(name.replace("ee","i"));


//        String str = String.format(Locale.US, "The value of pi is %f", Math.PI);
//        System.out.println(str);

//        System.out.println(name.startsWith("Nee"));
//        System.out.println(name.endsWith("Nee"));

//        System.out.println(name.charAt(5));

        String stylename="Pushpadss";
//        System.out.println(stylename.indexOf("s",4));
//        System.out.println(stylename.indexOf("s"));

//        System.out.println(stylename.lastIndexOf("s",1));

//        System.out.println(name.equals("Neeraj"));
//        System.out.println(name.equalsIgnoreCase("NEeRaj"));


//        System.out.println("Sneha Said \"HI Rahul, How Are You?\" ");
//        System.out.println("I Replied Her \"I'm Fine But Pls You Eat Cow's Dung!!\"");

        char[] data = {'N', 'e', 'e', 'r','a','j'};
        String str = String.copyValueOf(data, 0, 5);
        System.out.println(str);

    }
}