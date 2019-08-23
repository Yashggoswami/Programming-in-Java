import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner ob =new Scanner(System.in);
        //bubble sort
        System.out.println("Enter the elements in array-");
        for(int i=0;i<10;i++)
        {
            arr[i]=ob.nextInt();
        }
        int min=1;
        for(int i=9;i>0;i--)
        {

            for(int j=8;j>=0;j--)
            {
                if(arr[j]>arr[j+1])
                {
                    min=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=min;

                }
            }
        }
        System.out.println("Enter the element you want to search ");
        int sc=ob.nextInt();
        int i=0;
        int first=0;
        int last=9;
        int mid=(first+last)/2;
        while(first!=last) {

            if (arr[mid] == sc) {
                i=1;
                break; }
            else if(arr[mid]>sc)
            {
                last=mid;
                mid=(first+last)/2;
            }
            else
            {
                first=mid;
                mid=(first+last)/2;
            }
        }
        if(i==1)
        {
            System.out.println("the element is present at " + (mid+1) + " location");

        }
        else
        {
            System.out.println("Element is not in array");
        }
        System.out.println("Element after sorting is");
        for(int x=0;x<10;x++)
        {
            System.out.println(arr[x]);
        }
    }
}
