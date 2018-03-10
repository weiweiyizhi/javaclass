import java.util.Scanner;  
public class add{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in); 
		int firstNumber;
		int secondNumber;
		int sum;
		System.out.print("请输入第一个数");
		firstNumber = input.nextInt();
		System.out.print("请输入第二个数");
		secondNumber = input.nextInt();
		sum = firstNumber + secondNumber;
		System.out.printf("和为%d\n", sum);
	}
}
