public class shuixian4 {
    void  shuixianhua()
    {
        int i,x,y,n;
        for(i=100;i<=10000;i++)
        {
            n=i;
            x=0;
            while(n!=0)
            {
                y=n%10;
                x=x+y*y*y;
                n=n/10;
            }
            if(x==i)
                System.out.print(" "+i);
        }
    }
}

