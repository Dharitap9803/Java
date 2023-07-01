//Write a program which demonstrate conditional operator ,compound assignment operator ,pre-post increment and decrement operator
//bitwise operator,logical short circuit operator.
import java.util.Scanner;
class practical5
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
       int x=5,y=4,z=7;
       System.out.println(x>y&&x>z||y<z);
       System.out.println((x<z||y>z)&&x<y);
	
	
		int a,b;
		x=20;
		y=(x==1)?61:90;
		System.out.println("Value of y is:" + y);
		y=(x==20)?61: 90;
		System.out.println("Value of y is :" + y);
	
	
	int p=69;
	int q=89;
	int r=79;
	int largestNumber=(x>y)?(x>z?x:z):(y>z?y:z);
	System.out.println("The largest numbers is :"+largestNumber);
    


		int m=10;
		int n=20;
		int o=0;


		o=m+n;
		System.out.println("o =m+n="+o);

		o+=m;
		System.out.println("o +=m  ="+ o);

		o-=m;
		System.out.println("o -=m =" + n);

		o*= m;
		System.out.println("o  *= m ="+ o);

		m=10;
		o=15;
		o/=m;
		System.out.println("o %=m  ="+o);

		o<<=2;
		System.out.println("o  <<=2  ="+ o);

		o>>=2;
		System.out.println("o  >>=2=  ="+ o);

        
        o ^=m;
		System.out.println("o  ^=m  ="  + o);

		o|=m;
		System.out.println("o |=m   "+ o );

		if (false && true && true){
			System.out.println("This output " + "will not "+ "be printed");

		}
		else {
			System.out.println("This output "+ "got printed actually "+"due to short circuit");
		}
		if (true && true && true ){
			System.out.println("This output"+"gets print "+"as ther will be "+"no short circuit");

		}
		else{
			System.out.println("this output"+"will not "+"be printed ");


		}
		if (true || false || false ){
			System.out.println("This output"+"got printed actually"+"due to short circuit");
		}
		else{
			System.out.println("this output"+"will not"+"be printed");
		}
		if (false || false ||true ){
			System.out.println("this output "+"gets print "+"as there will be "+"no short circuit");
		}
		else {
			System.out.println("This output"+"will not"+"be printed");
		}
		int s =5;
		int t =7;

		System.out.println("s|t ="+ (s | t  ));
        System.out.println("s&t =" + (s &t));
        System.out.println("s^t ="+(s^t));
        System.out.println("~s =" + ~s);


        s &= t;
        System.out.println("s=" + s);



        String binary []={
        	"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        	int e=3;
        	int f=6;

        	 int g=e |f;
        	 int h = e & f;
        	 int i=e ^ f;
        	 int j=(~e & f)|( e & ~f);
        	


        	 System.out.println(" e="+binary[e]);
        	 System.out.println("f="+binary[f]);
        	 System.out.println("e|f=   "+binary);
        	 System.out.println("e&f=   "+binary[h]);
        	 System.out.println("e^f=   "+binary[i]);
        	 System.out.println("~e  &  f|e&~f=  "+binary[j]);
        	


        	 System.out.println("Enter first number :");
        	 int num1 = input.nextInt();


        	 System.out.println("Enter second number :");
        	 int num2 =input.nextInt();


        	 System.out.println("Bitwise  AND:"+  (num1 &  num2));
        	 System.out.println("Bitwise  OR:"+  (num1   | num2));
             System.out.println("Bitwise  XOR:"+  (num1  ^  num2));
             System.out.println("Bitwise  NOT:"+  (~num1));
             System.out.println("Bitwise  Left Shift:"+  (num1  <<2));
             System.out.println("Bitwise  Right Shift:"+  (num1 >>2));
             System.out.println("Bitwise  Unsigned  Right Shift:"+  (num1 >>>  2));

             

             int num =5;


             int result = ++num;
             System.out.println("Pre-increment: "+result);


             result = num++;
             System.out.println("Post-increment:"+result);
             System.out.println("Updated value:"+num);


             result = --num;
             System.out.println("Pre-decrement :"+ result);

             result =num--;
             System.out.println("Post-decrement:"+result);
             System.out.println("Updated value:"+ num);

        }
	}

	


