import java.util.Scanner;
class leap_year
{
	public static void main (String[] args)
	{
		int year;
		Scanner s = new Scanner(System.in);
		year=s.nextInt();
		if (year%4==0)
		System.out.println("leap year");
		else
		System.out.println("non year year");
	}
}
