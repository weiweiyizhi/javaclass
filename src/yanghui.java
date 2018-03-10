public class yanghui {
    public static void main(String[] args)
    {
        int m=5;
        int a[][]=new int [m][m];
        int i,j;
        for(i=0;i<m;i++)
        {
            a[i][0]=1;
        }
        for(i=1;i<m;i++)
        {
            for(j=1;j<m;j++)
            {
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(a[i][j]!=0)
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }

    }
}
