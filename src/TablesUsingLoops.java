import java.util.Scanner;

public class TablesUsingLoops {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int Yes=1;
        while(Yes==1) {
            System.out.println("Enter Table number: ");
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", n, i, n * i);
            }
            System.out.println("If you want to continue (press1) if not (press 0)");
            Yes =sc.nextInt();

        }

        //Decrement Method
//        int n=10;
//        for (int i=10; i>=1; i--){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

    }
}
