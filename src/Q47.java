import java.util.Scanner;

public class Q47 {

    double area;void calarea(){System.out.println("Area of Circle is "+(area=3.14*rad*rad));}
    double rad;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rad;
        Q47 obj=new Q47();
        System.out.println("Enter the radius ");
        obj.rad=sc.nextInt();
        obj.calarea();

    }

}
