public class Q40{
    public static void main(String[] args) {

        empsal obj1=new empsal();
        empsal obj2=new empsal();
        obj1.get_First_name("mars");
        obj1.get_last_name("Matheu");
        obj1.get_salary(86593.5832);
        obj2.get_First_name("venus");
        obj2.get_last_name("johns");
        obj2.get_salary(1493332.5832);
        System.out.println("Yearly Salary of "+obj1.first_name+" "+obj1.last_name+" is "+obj1.salary);
        System.out.println("Yearly Salary of "+obj2.first_name+" "+obj2.last_name+" is "+obj2.salary);
        obj1.salincr();
        obj2.salincr();



    }

}
class empsal extends Employeee{
    double salry;
    void salincr(){
        salry=super.salary+super.salary*0.1;
        System.out.println("incremented salary of "+super.first_name+" "+super.last_name+" will be "+salry);
    }
}