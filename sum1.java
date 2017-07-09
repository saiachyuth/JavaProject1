import java.util.Scanner;
class sum1
{
	public static void main (String[] args)
	{
	  int x1,i;
	  int s1=0;
	 Scanner s= new Scanner(System.in);
	 x1=s.nextInt();
	 for(i=1;i<=x1;i++)
	 s1=s1+i;
	 System.out.println("sum:"+s1);
  	}
}
