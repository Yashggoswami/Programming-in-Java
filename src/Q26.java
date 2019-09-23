public class Q26 {
    public static void main(String[] args)
    {
        System.out.println("3d Array looks like-");
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6},
                        {1, 9, 3},

                }
        };
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<3;k++)
                {
                    System.out.print(test[i][j][k]+" ");

                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
