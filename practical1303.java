//. Write a program which will perform following functionality on String:c)count total words 
import java.util.Scanner;
import java.util.*;

class practical1303
{
	public static void main(String[] args)
	{
           Scanner scanner=new Scanner(System.in);
         {
           	 
            System.out.println("Enter the Sentences :");

           	String  sentence = scanner.nextLine();

           	int digitCount =0;

         	for (char ch : sentence.toCharArray())
           	 
           	 {
                if (Character.isDigit(ch)) 
                  
                  {
                     digitCount++;
           	   
                  }
       
             }   
             System.out.println("Total count of digits: " + digitCount);
         }
	}
}