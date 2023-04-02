import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {

        //Question1
//        int a = 10;
//
//        if (a == 11) {
//            System.out.println("I am 11");
//        } else {
//            System.out.println("I am not 11");
//        }

        //Question2
        Scanner sc = new Scanner(System.in);
//        byte Subject1,Subject2,Subject3;
//
//        System.out.print("Enter percentage of Subject1:");
//        Subject1=sc.nextByte();
//        System.out.print("Enter percentage of Subject2:");
//        Subject2=sc.nextByte();
//        System.out.print("Enter percentage of Subject3:");
//        Subject3=sc.nextByte();
//        float avg=(Subject1+Subject2+Subject3)/3.0f;
//        System.out.println("Overall Percentage Is:"+avg);
//
//        if (avg>=40 && Subject1>=33 && Subject2>=33 && Subject3>=33)
//        {
//            System.out.println("Congratulation!!You Passed The Exam");
//        }else
//        {
//            System.out.println("Sorry!!You Failed The Exam! Please Try Again.");
//        }
        //Question3
//        System.out.print("Enter Your Income:");
//
//        float tax = 0;
//        float income = sc.nextFloat();
//
//        if (income <= 2.5f)
//        {
//            tax = tax = 0;
//        }
//        else if (income > 2.5f && income <= 5f)
//        {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income > 5f && income <= 10f)
//        {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if (income >= 10)
//        {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee: " + tax);

        //Question4:
//        int day;
//        int again;
//
//            System.out.print("Enter The Day:");
//            day = sc.nextInt();
//
//            switch (day)
//            {
//                case 1 -> System.out.println("Monday");
//                case 2 -> System.out.println("Tuesday");
//                case 3 -> System.out.println("Wednesday");
//                case 4 -> System.out.println("Thursday");
//                case 5 -> System.out.println("Friday");
//                case 6 -> System.out.println("Saturday");
//                case 7 -> System.out.println("Sunday");
//            }
//
//            while (day > 7)
//               {
//                   System.out.println("These day dose not exist Please Try Again!!");
//                   System.out.println("Enter The Day");
//                   day= sc.nextInt();
//
//                   switch (day)
//                   {
//                       case 1 -> System.out.println("Monday");
//                       case 2 -> System.out.println("Tuesday");
//                       case 3 -> System.out.println("Wednesday");
//                       case 4 -> System.out.println("Thursday");
//                       case 5 -> System.out.println("Friday");
//                       case 6 -> System.out.println("Saturday");
//                       case 7 -> System.out.println("Sunday");
//                   }
//
//
//               }
        //Question5
//        System.out.print("Enter a year: ");
//        int year = sc.nextInt();
//
//        boolean isLeapYear = false;
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    isLeapYear = true;
//                }
//            } else {
//                isLeapYear = true;
//            }
//        }
//
//        if (isLeapYear) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }

        //Question6
        System.out.println("Enter Website Here:");
        String Website=sc.next();
        if (Website.endsWith(".com"))
        {
            System.out.println("This is an Commercial Website ");
        }
        else if (Website.endsWith(".org"))
        {
            System.out.println("This is an Organised Website ");
        }
        else if (Website.endsWith(".in"))
        {
            System.out.println("This is an Indian Website ");
        }
    }
}
