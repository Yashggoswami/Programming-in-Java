import java.util.Scanner;

public class Q48 extends Q47 {
    double perimeter;
    void calperimeter(){
        System.out.println("Perimeter of Circle "+(perimeter=2*3.14*super.rad)); }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Q48 obj=new Q48();
        System.out.println("Enter the radius ");
        obj.rad=sc.nextInt();
        obj.calperimeter();
    }
}
