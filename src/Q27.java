public class Q27 {
    void all(int ...a)
    {   int[] j=a.clone();
        System.out.println("no of Arguments "+a.length);
        for(int x:a)
            System.out.print(x+" ");
        System.out.println();
        for(int x:j)
            System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Q27 obj=new Q27();
        obj.all(1);
        obj.all(2,3,4,5,6);
        obj.all(12,56,80);
    }
}

