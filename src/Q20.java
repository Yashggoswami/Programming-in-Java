import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner ob=new Scanner(System.in);
        //selection sort
        System.out.println("Enter the elements in array");
        for(int i=0;i<5;i++)
        {
            arr[i]=ob.nextInt();
        }
        int min;
        int loc=1;
        for(int i=0;i<4;i++)
        {min=arr[i];
            for(int j=i+1;j<5;j++)
            {
                if(min>arr[j])
                {
                    min=arr[j];
                    loc=j;
                }
            }
            min=arr[i];
            arr[i]=arr[loc];
            arr[loc]=min;
        }
        System.out.println("The elements in array after sorting will be");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
