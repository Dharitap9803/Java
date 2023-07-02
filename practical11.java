//Write a program to count the number of words that start with capital letters

import java.util.Scanner;
import java.util.*;

class practical11
{
   public static void main(String[] args)
   {
	 Scanner input=new Scanner(System.in);

	  {   
		

		System.out.println("Enter the String:");
		String str =input.nextLine();
        
		 int count=0;
		boolean prevSpace= true;

        //condition given to the string 
		for( int i=0; i< str.length(); i++)
		{
		char ch=str.charAt(i);

			if(Character.isUpperCase(ch))
			{
				if(prevSpace)
				{
					count++;
				}
				prevSpace = false;
            }
            else if (Character.isWhitespace(ch));
            {
            	prevSpace=true;
            }


		 }
		  System.out.printf("Print the number the words that starts with the capital letters: %d",count);


		  input.close();

	   }
   }

}


