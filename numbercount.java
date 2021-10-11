package precourse;

public class numbercount {
	public static void main(String [] args)
	{
		int num=895623,count=0;
		do
		{
			num=num/10;
			count=count+1;			
		}while(num!=0);
		System.out.println("Total number of digits "+count);
	}
	
}
