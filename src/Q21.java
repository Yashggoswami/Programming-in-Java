import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        Scanner ob =new Scanner(System.in);
        //bubble sort
        System.out.println("Enter the elements in array-");
        for(int i=0;i<5;i++)
        {
            arr[i]=ob.nextInt();
        }
        int min=1;
        for(int i=4;i>0;i--)
        {

            for(int j=3;j>=0;j--)
            {
                if(arr[j]>arr[j+1])
                {
                    min=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=min;

                }
            }
        }
        System.out.println("Element after sorting is");
        for(int x=0;x<5;x++)
        {
            System.out.println(arr[x]);
        }
    }

}
