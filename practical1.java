//write a program which will greet you with your name
import java.util.Scanner;
public class practical1{
	public static void main (String args[])
	{
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = scanner.nextLine();

		System.out.println("Hello,"+name+"How are you ?Nice to see you !");

		scanner.close();
	}
}
