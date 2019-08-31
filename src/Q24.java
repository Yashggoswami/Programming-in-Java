public class Q24 {
    public void sum(int[] a)
    {int s=0;
        for(int x:a)
        {
            s=s+x;
        }
        System.out.println("Sum - "+s);
    }

    public static void main(String[] args) {
        Q24 obj=new Q24();
        obj.sum(new int[]{1,2,3,4});
    }
}
