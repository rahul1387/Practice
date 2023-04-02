import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner sc =new Scanner (System.in);


        System.out.println("What Is Your Name");

        String name=sc.next();
        System.out.println("Hello "+name+"!");

        System.out.println("How old are You?");
        int i= sc.nextInt();

        while (i<1||i>100){

            System.out.println("The Age Cannot Be So Long");
            System.out.println("Please Try Again!!");
            i=sc.nextInt();

        }

    }

}
