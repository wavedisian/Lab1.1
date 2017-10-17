//Wes Avedisian U8A
public class ControlStructures 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			foobarbaz(500);
			primeprinter(50);
			System.out.println("yay, i'm finished");
	}
	public static void foobarbaz(int lim2)
	{
		int z=1;
		while(z<=lim2)
		{
			if(z%3==0)
			{
				System.out.print("foo" + " ");
			}
			if(z%7==0)
			{
				System.out.print("bar" + " ");
			}
			if(z%10==0)
			{
				System.out.print("baz" + " ");
			}
			if((z%3!=0)&&(z%7!=0)&&(z%10!=0))
			{
				System.out.print(z + " ");
			}
			z++;
		}
	}
	public static void primeprinter(int lim)
	{
		int x=2;
		int p=0;
		while(p<lim)
		{
			if(p%10==0)
			{
				System.out.println();
			}
			if(isprime(x) == true);
			{
				
				System.out.print(x + " ");
				p++;
			};
			if(isprime(x) == false)
			{
				System.out.print("");
			}
			x++;
		}
		
	}
	public static boolean isprime(int x)
	{
		int G = 1;
		while(G<=(x/2))
		{
			if(x%G!=0)
			{
				G++;
			}
			else
			{
				return(false);
			}
		};
		return(true);
		
	}
}
