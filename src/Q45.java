import java.util.*;
public class Q45 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int j=1;
       while(j==1)
       {
        System.out.println("Enter number - ");
       String var=new String();
       var=scan.nextLine();
       if(var.length()!=5)
           System.out.println("it's Not a five digit number ");
       else
       {  j=0;
           StringBuffer reverse=new StringBuffer();
           for(int i=var.length()-1;i>-1;i--)
               reverse.append(var.charAt(i));

           if(var.compareToIgnoreCase(reverse.toString())==0)
               System.out.println("It's a panindrome");
           else
               System.out.println("NOt a panindrome");

       }
    }
    }
}
