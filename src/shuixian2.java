public class shuixian2
{
    public static void main(String[] args)
    {
        shuixian2 shui=new shuixian2();
        System.out.print("100到10000的水仙花数有：");
        shui.shuixianhua();
    }
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
