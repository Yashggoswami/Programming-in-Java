
import java.util.Scanner;


public class Q4 {
    int[] intArray = new int[5];
    int sum;
    float avg;

    void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the element in array");
        for(int i=0;i<intArray.length;i++)
        {
            intArray[i]=ob.nextInt();
        }

    }
    void output(){
        for( int i=0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }

    }
    void aveg()
    {


        for( int i=0;i<intArray.length;i++)
        {
            sum=sum+intArray[i];
        }
        avg= sum/intArray.length;
        System.out.println("The sum of number is "+sum);
        System.out.println("The average of number is "+avg);


    }

    public static void main(String[] args) {
        Q4 obj=new Q4();
        obj.input();
        obj.output();
        obj.aveg();

    }
}
