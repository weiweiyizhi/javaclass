
import javax.swing.JOptionPane;
public class runnian{
        public static void main(String[] args) {
            String Year=JOptionPane.showInputDialog("请输入年数：");
            int year=Integer.parseInt(Year);
            isleapyear(year);
        }
        private static void isleapyear(int year) {
            String is;
            is=((year%4==0&&year%100!=0)||year%400==0)?"是闰年":"不是闰年";
            JOptionPane.showMessageDialog(null,year+is);
        }
}
