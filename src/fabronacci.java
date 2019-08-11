import java.util.Scanner;

class fab_cal{
    int i;
    long j=1;
    int two=1;
    int o=1;
    int one=1;
    int sum=1;

    void input(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number ");
        int i=obj.nextInt();
        System.out.println("fabronacci series -:");
        System.out.println(" "+one);
        System.out.println(" "+two);
        for(o=3;o<=i;o++){

            sum=one+two;
            System.out.println(" "+sum);
            one=two;
            two=sum;
        }


    }
    public void cal(){

    }





}



public class fabronacci{
    public static void main(String[] args) {
    fab_cal obj1=new fab_cal();
    obj1.input();

    }

}
