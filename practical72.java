class practical72
{
	public static void main(String args[])
	{
		int[] numbers=  {2,4,6,8,10};

		int  product=0;
		for(int num: numbers)
		{
			product *=num;
		}

		System.out.println("product  "+  product );
	}
}