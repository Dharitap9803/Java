import java.util.Scanner;
import java.util.*;


public class practical10 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        line = line.toLowerCase();

        for (int i = 0; i < line.length(); i++) 
        {
            char ch = line.charAt(i);

            if (Character.isLetter(ch))
             {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                {
                    vowelCount++;
                } else
                 {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}





	

