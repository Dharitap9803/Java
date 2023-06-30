import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.Arrays;

public class practical74
{
	static int max;
	static int min;
    public static int max_min(int[]b)
	{
		max=b[0];
		min=b[0];
		int len=b.length;
        for (int i=0;i<len-1;i=i+2)
        {
        	if(i+1>len)
        	{
        		if(b[i]>max)max=b[i];
        		if(b[i]<min)min=b[i];

        	}
        if(b[i]>b[i+1])
        {
        	if(b[i]>max)max=b[i];
        	if(b[i+1]<min)min=b[i+1];
        }
        if(b[i]<b[i+1])
        {
        	if(b[i]<min)min=b[i];
        	if(b[i+1]>max)max=b[i+1];
        }

     }
	    public static void main(String[]  args);
	{
		int[] b={101,100,200,456,789,999,345,786};
		max_min(b);
		System.out.println("Original Array :"+Arrays.toString(b));
		System.out.println("Maximum value for the above array="+max);
		System.out.println("Minimum value for the above array="+min);
	}
}