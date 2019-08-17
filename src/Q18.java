import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        int i;
        int j=0;
        int last=1;
        int add=0;
        int n=1;
        int o=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the element");
        i=ob.nextInt();

        for(int num=i;num!=0;j++)
        {
            num=num/10;

        }
        for(int r=i;r!=0;)
        {
            last=r%10;
            while (o!=j)
            {
                n=n*last;
                o++;
            }
            o=0;
            add=add+n;
            n=1;
            r=r/10;
        }
        if(add==i)
        {
            System.out.println("its an armstrong number");
        }
        else
            System.out.println("its NOT an armstrong number");


    }

}
