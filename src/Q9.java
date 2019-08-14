public class Q9 {
    int i=5;
    void selection_statement()
    {
        if(i%2==0)
            System.out.println(i+" is an even number");
        else if(i%2!=0)
            System.out.println(i+" is a odd number");
        else
            System.out.println(i+" is Not a number");
    }
    void iteration_statement()
    {
        while(i<10)
        {
            System.out.println(i);
            i++;
        }
        for(int j=0;j<i;j++)
        {
            System.out.println(j);
        }
        do{
            System.out.println(i);
            i++;
        }while(i<10);
    }
    void transfer_statement()
    {
        for (int j=0;j<i;j++)
        {
            if(j==1)
                continue;

            else if(j==4)
            {
                System.out.println("last element");
                break;
            }
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Q9 obj=new Q9();
        obj.selection_statement();
        obj.iteration_statement();
        obj.transfer_statement();
    }
}
