import java.util.Scanner;
public class Q37 {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.enter();
        obj.output();
    }
}

class Employee
{
    String first_name;
    String last_name;
    double salary;
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
