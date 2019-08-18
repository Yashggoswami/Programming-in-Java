import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        int j;
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the number");
        j=ob.nextInt();
        int num=j;
        int i=2;
        for(;i<j;i++)
        {
            num=num%i;
            if(num==0)
            {
                System.out.println("THIS IS NOT A Prime number");
                break;
            }
            else
                num=j;
        }
        if(i==j)
        {
            System.out.println("THIS is a prime number");
        }
    }
}
