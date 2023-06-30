import java.util.Scanner;
import java.util.*;
import java.lang.*;

class practical8
{
	public static void main(String args[])
	{
	    int i,j,len,k;

        String str=new String();
		char ch[]=new char[25];
		Scanner s=new Scanner(System.in);

		System.out.print("\nEnter your string:");
		str=s.nextLine();

		len=str.length();
		ch=str.toCharArray();
		k=len;


		for(i=len;i>=0;i--)
		{
			for(j=0;j<=len;j++)
			{
				if(i<j)
				{
					System.out.print(ch[len-k]+" ");
					k--;
				}
				else
				 System.out.print(" ");
			}
			System.out.println();
			k=len;
		}

	}
	

}