
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		if(args.length>0)
		{
		for(int i=0;i<args.length;++i)
		//for(String data:args)
		{
				sum=sum+Integer.parseInt(args[i]);
				
		}
		System.out.println(sum);
		}
		else
		{
			System.out.println("You did not pass any command line argument");
		}
	}
}
