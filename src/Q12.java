import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        int p;
        double interest_rate=1;
        double a=1;
        System.out.println("Enter the principal amount");
        Scanner ob =new Scanner(System.in);
        p=ob.nextInt();
        for(int i=1;i<=10;i++)
        {
            interest_rate=interest_rate*(1+0.05);
        }
        a=p*(interest_rate-1);
        System.out.println("The compound interest for 5% interest rate on "+p+"$ within 10 years - "+a);


    }
}
