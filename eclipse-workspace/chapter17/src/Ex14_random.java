import java.util.Random;
public class Ex14_random 
{
	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		Random rand1 = new Random();
		for(int i=0; i<10; i++) 
			{
			System.out.print(rand1.nextInt(10)+" ");
		    }
			System.out.println();
		
		Random rand2 = new Random(32);
		for(int i=0; i<10; i++) 
		{
			System.out.print(rand2.nextInt(10)+" ");
			}
			System.out.println();
		}
}
