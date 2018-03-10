
import javax.swing.JOptionPane;
public class Sub{
    	public static void main(String args[]){
	   	String firstNum;
	   	String secondNum;
	  	 int num1;
	  	 int num2;
	  	 int result;
             	firstNum = JOptionPane.showInputDialog("请输入第一个数：");
	   	secondNum = JOptionPane.showInputDialog("请输入第二个数：");
	   	num1 = Integer.parseInt(firstNum);
	   	num2 = Integer.parseInt(secondNum);  
             	result = num1 - num2;
			JOptionPane.showMessageDialog(null, "相减后的结果是："+result, "标题：结果", JOptionPane.PLAIN_MESSAGE);
    }
}
