import java.util.Random;
public class Q25 {
    int[][][] arr=new int[3][4][6];
    public void fill()
    {
        Random ob=new Random();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<6;k++)
                {
                    arr[i][j][k]=ob.nextInt(200);
                }

            }
        }

        int max=0;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<6;k++)
                {
                    if(max<arr[i][j][k])
                    {
                        max=arr[i][j][k];

                    }
                }

            }
        }

        System.out.println("Maximum - "+max);
        int min=arr[1][1][1];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<6;k++)
                {
                    if(min>arr[i][j][k])
                    {
                        min=arr[i][j][k];

                    }
                }

            }
        }
        System.out.println("Minimum - "+min);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<6;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Q25 obj=new Q25();
        obj.fill();
    }
}
