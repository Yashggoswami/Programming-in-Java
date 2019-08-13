import java.util.Scanner;
public class Q7 {
    long sum=1l;
    void factorial(int i)
    {
        if(i==0)
        {
            output();}
        else{
            sum=sum*i;
            i--;
            factorial(i);
        }
    }
    void output()
    {
        System.out.println("The factorial will be "+sum);
    }

    public static void main(String[] args) {
        Q7 obj=new Q7();
        int j;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to be found out");
        j=ob.nextInt();
        obj.factorial(j);
    }
}
