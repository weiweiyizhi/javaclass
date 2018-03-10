import java.util.Arrays;
import java.util.Scanner;

public class shuzu {
    public static void main(String[] args)
    {
        int a[]=new int [100];
        double m;
        int i;
        for(i=0;i<100;i++)
        {
            m= 100*Math.random();
            a[i]=(int) m;
        }                             //生成数组


        Arrays.sort(a);               //数组排序


        System.out.print("请输入你想查找的值\n");
        int key,location;
        Scanner input=new Scanner(System.in);
        key=input.nextInt();
       location= Arrays.binarySearch(a,key);
       if(location<0)
           System.out.print("数组中没这个值\n");//查找指定值
        else
            System.out.printf("其中一个的位置为排序后的第%d\n",location+1);

        String st;
        st=Arrays.toString(a);;
        System.out.printf("数组输出：%s\n",st);    //转换成字符串并输出
    }
}
