import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        int[] arr=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three elements");
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        if(arr[i]==0)
        {
            System.out.println("non zero value not allowed enter again");
            arr[i]=sc.nextInt();
        }
        }
        int total=arr[0]+arr[1]+arr[2];
        int product=arr[0]*arr[1]*arr[2];
        int small=(arr[0]<arr[1]?(arr[2]<arr[0]?arr[2]:arr[0]):(arr[2]<arr[1]?arr[2]:arr[1]));
        int great=(arr[0]>arr[1]?(arr[2]>arr[0]?arr[2]:arr[0]):(arr[2]>arr[1]?arr[2]:arr[1]));
        System.out.println("sum -  "+total+"\n"+"Product -  "+product+"\n"+"Smallest -  "+small+"\n"+"Greatest -  "+great);

    }
}
