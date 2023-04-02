import java.util.Scanner;
public class PracticeSet2 {
    public static void main(StringPractice[] args) {

        //Question1
        float a = 7/4.0f * 9/2.0f;
        System.out.println("Answer Of Question 1 Is:"+a);

        //Question2
        char grade= 'B';
        grade=(char) (grade+8);
        System.out.print("Answer Of Question 2 Is:"+grade);
        // Decrypting the grade
        grade = (char) (grade-8);
        System.out.print(","+grade);

        //Question3
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        System.out.print("Answer Of Question 3 Is:");
        System.out.println(d>8);


        //Question4
        int v = 3;
        int u = 56;
        int b = 67;
        int s = 98;
        System.out.print("Answer Of Question 4 Is:");
        System.out.println((v*v-u*u)/2*b*s);

        //Question5
        int x=7;
        int c=7*49/7+35/7;
        System.out.print("Answer Of Question 5:");
        System.out.print(c);

    }

}
