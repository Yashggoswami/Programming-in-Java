import java.util.Scanner;
public class Q14 {

    public  static  void  main  (String  args[ ] )
    {
        byte x;
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter the element");
        x=ob.nextByte();
        System.out.println ("x  =  "  + x) ;
        System.out.println ("x  >>  2  =  "  +   (x>>2) ) ;
        System.out.println ("x  <<  1  =  "  +  (x<<1) ) ;
        System.out.println ("x  >>  1  =  "  +  (x>>1) ) ;
    }
}
