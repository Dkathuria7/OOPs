import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	       try{
	              Scanner obj = new Scanner(System.in);
	              int t = obj.nextInt();
	              while (t > 0)
	              {
	                     t--;
	                     int x = obj.nextInt();
	                     int y = obj.nextInt();
	                     if (x < y)
	                     {
	                           System.out.println ("FIRST"); 
	                     }
	                     else if (y < x)
	                     {
	                            System.out.println ("SECOND");
	                     }
	                     else
	                     {
	                            System.out.println ("ANY");
	                     }
	              }
		}catch(Exception e){
			return;
		}
	}
}