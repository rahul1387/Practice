public class PracticeSet3 {
    public static void main(String[] args) {
        //Question1
        String naam="     Harry Potter     ";
//        naam=naam.toLowerCase();
//        System.out.println(naam);

        //Question2
        System.out.println(naam.replace(" ","_"));

        //Question3
        String letter = "Dear <|name|>,Thanks a Lot";
       letter= letter.replace("<|name|>","Neeraj");
        System.out.println(letter);

        //Question4
//        System.out.println(naam.trim());
        String myString = "The string contains    doubleand triple space";
        System.out.println(myString.indexOf("s",19));

        //Question5
        System.out.println("\"Hi Neeraj\",I replied \"Hello\"");
    }
}
