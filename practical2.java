//Write a program which will print greeting message for your 5 friends.Friends name should be entered as command line arguments.
import java.util.Scanner;
public class practical2
{
	public  static void main(String args[])
	{
		if (args.length<5){
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the name of the friends as command line arguments");
			return;
		}
		String Bhavik=args[0];
		String Sunny =args[1];
		String Hasti =args[2];
		String Beauty=args[3];
		String Vidhi=args[4];

		System.out.println("Greeting messages for your friends :");

		System.out.println("1.Hello," +Bhavik+"!");
		System.out.println("2,Hii,"+ Sunny + "!");
		System.out.println("3,heyy,"+Hasti+"!");
		System.out.println("4,howdy,"+Beauty+"!");
		System.out.println("5,hiii there,"+Vidhi+"!");
		
	}
}
