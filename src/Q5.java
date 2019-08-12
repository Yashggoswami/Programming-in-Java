import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two numbers");
        i=ob.nextInt();
        j=ob.nextInt();
        if (i%j==0){
            System.out.println(i+" is a multiple of "+j);
        }
        else{
            System.out.println(i+" is NOT a multiple of "+j);
        }
    }
}
