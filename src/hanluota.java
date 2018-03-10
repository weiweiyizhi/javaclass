import java.util.Scanner;

public class hanluota {
    public static void main(String[] args)
    {
        hanluota han=new hanluota();
        System.out.print("请输入汉罗塔总盘数：");
        Scanner input=new Scanner(System.in);
        int a;
        a=input.nextInt();
        han.mv('A','B','C',a);
    }
    void mv(char a,char b,char c,int n) //把n个木塔从a移到c
    {
        if(n==1)
        {
            System.out.print("盘1:"+a+"-->"+c+"\n");
            return;
        }
        else
        {
            mv(a,c,b,n-1);
            System.out.print("盘"+n+":"+a+"-->"+c+"\n");
            mv(b,a,c,n-1);
        }
    }
}
