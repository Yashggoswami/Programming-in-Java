public class Q11 {
    int vol,l,b,h,r;
    void volume(int r)
    {
        double v;
        v=(4/3)*3.14*(r*r*r);
        System.out.println("Volume of sphere is "+v);
    }
    void volume(int r,int h)
    {
        double v;
        v=3.14*r*r*h;
        System.out.println("Volume of Cylinder is "+v);
    }
    void volume(int l,int b,int h)
    {
        double v;
        v=l*b*h;
        System.out.println("Volume of Rectangular prism is "+v);
    }

    public static void main(String[] args) {
        Q11 obj = new Q11();
        obj.volume(10);
        obj.volume(2,4);
        obj.volume(2,4,6);

    }
}
