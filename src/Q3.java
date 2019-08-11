import java.util.Scanner;

public class Q3 {
    int[] intArray = new int[7];
    int min,max;


    void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the element in array are");
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
    void minimax()
    {
        max=intArray[0];
        min=intArray[0];
        for( int i=1;i<intArray.length;i++)
        {
            if(max<=intArray[i]){
                max=intArray[i];
            }
            if(min>=intArray[i]){
                min=intArray[i];
            }
        }
        System.out.println("The maximum number is "+max);
        System.out.println("Minimum number is "+min);

    }

    public static void main(String[] args) {
        Q3 obj=new Q3();
        obj.input();
        obj.output();
        obj.minimax();
    }
}
