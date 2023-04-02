import java.util.Scanner;

public class Main {



    public static void main(StringPractice[] args) {
        System.out.println(" This Is Percentage Calculator");

        Scanner sc=new Scanner (System.in);

        System.out.println("Enter Your Marks");

        int Science=sc.nextInt();
        int Maths=sc.nextInt();
        int English=sc.nextInt();
        int Hindi=sc.nextInt();
        int Marathi=sc.nextInt();

        int Result=Science+Maths+Marathi+Hindi;
        int percentageResult=(Result*100)/500;
        System.out.println("Your Result is "+percentageResult+"%");

    }
}