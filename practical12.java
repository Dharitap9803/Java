//Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. Display the total count of each vowel and digits for all sentences.
import java.util.Scanner;
import java.util.*;
class practical12
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		{
			System.out.println("Enter the sentence:");
			String sentence = scanner.nextLine();

            
            int aCount =0;
            int eCount =0;
            int iCount =0;
            int oCount =0;
            int uCount =0;
            int digitCount =0;

			String[] sentences = sentence.split("\\s+");

			for(String s: sentences)
			{
				for(char ch: s.toLowerCase().toCharArray())
				{
					if(Character.isDigit(ch))
					{
						digitCount++;
					}
					else if(Character.isLetter(ch))
					{
						switch(ch)
						{
						case 'a':
							aCount++;
							break;
						case 'e':
							eCount++;
							break;
						case 'i':
							iCount++;
							break;
						case 'o':
							oCount++;
							break;
						case 'u':
							uCount++;
							break;
						}
					}
				}
			}

			System.out.println("Total count of 'a':"+ aCount);
			System.out.println("Total count of 'e':"+ eCount);
			System.out.println("Total count of 'i':"+ iCount);
			System.out.println("Total count of 'o':"+ oCount);
			System.out.println("Total count of 'u':"+ uCount);
			System.out.println("Total count of digits :"+  digitCount);
		}
    }
}