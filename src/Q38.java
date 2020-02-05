
import java.util.Scanner;
public class Q38 {
    public static void main(String[] args) {
        Employe obj=new Employe();
        obj.output();
        obj.enter();
        obj.output();
    }
}

class Employe
{
    String first_name;
    String last_name;
    double salary;
    Employe()
    {
        first_name="yash";
        last_name="Goswami";
        salary=5000000;

    }
    void enter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name");
        System.out.println("First Name");
        first_name=input.next();
        System.out.println("Last Name");
        last_name=input.next();
        System.out.println("Enter your Monthly Salary");
        salary=input.nextDouble();
    }
    void output()
    {
        System.out.println("Name - "+first_name+" "+last_name);
        System.out.println("Monthly Salary - "+salary);
    }
}
