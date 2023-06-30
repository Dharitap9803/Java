import java.util.Scanner;
class practical4
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter the marks :");
		int marks=scanner.nextInt();

		String grade;

		if(marks>=90 && marks<=100){
			grade ="A";
       }else if (marks>=80 && marks<90){
       	    grade ="B";
       }else if (marks >=60 && marks < 80){
       	    grade ="C";
       }else if (marks >=45 && marks <60){
         	grade ="D";
      }else if (marks >=35 && marks < 45){
      	    grade="E";
      }else{
      	    grade ="Fail";
      }
      System.out.println ("Grade: "+grade);
	}
}