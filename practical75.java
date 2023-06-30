import java.util.Scanner;
import java.util.*;
class practical75
{
        public static void main(String[]  args)
        {
        	//Initialization of the array
        	int[]arr=new int[]{5,2,8,7,1};
        	int temp=0;
        	{
        		//printing the elements of the array 
        		System.out.println("Elements of Original Array");
        		for(int i=0;i<arr.length;i++)
        		{
        			System.out.print("arr[i]"+"");

        		}
        		//Sort the array in the Acscending order
        	for(int i=0;i<arr.length;i++)
        	{
        		for(int j=i+1; j<arr.length; j++) 
        		{
        			if(arr[i]>arr[j])
        			{
        				temp=arr[i];
        				arr[i]=arr[j];
        				arr[j]=temp;
        			}
        		}
        	}
        		System.out.println();
        		//dislplaying the elements of the array after sorting
               System.out.println("Elements of array sorted in Ascending order:");
               for(int i=0;i<arr.length;i++)
               {
               	System.out.println(arr[i]+" ");
               } 

            }
            
        }
}