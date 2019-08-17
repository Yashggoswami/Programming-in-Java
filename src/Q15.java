import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        int p;
        double interest_rate=1;
        double[] arr ={0.05,0.06,0.07,0.08,0.09,0.1};
        double a=1;
        System.out.println("Enter the principal amount");
        Scanner ob =new Scanner(System.in);
        p=ob.nextInt();
        for(int j=0;j<5;j++) {
            for (int i = 1; i <= 10; i++) {
                interest_rate = interest_rate * (1 + arr[j]);
            }
            a = p * (interest_rate - 1);

            System.out.println("The compound interest for " + arr[j] + "% interest rate on " + p + "$ within 10 years - " + a);
        }

    }
}
