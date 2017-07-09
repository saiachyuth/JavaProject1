import java.util.Scanner;
class sum
{
	public static void main (String[] args)
	{
	  int n;
	  int sum=0;
	 Scanner s= new Scanner(System.in);
	 n=s.nextInt();
	 sum=n*(n-1)/2;
	 System.out.println("sum:"+sum);
  	}
}
