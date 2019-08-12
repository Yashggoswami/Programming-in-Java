public class Q6 {
    public static void main(String[] args) {
        long p=1;
        for(int i=1;i<=15;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
                p=p*i;
            }
        }
        System.out.println("The product of the odd number form 1 to 15 is "+p);
    }

}
