

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		while(makeDecision(i))
		{
			i=i*1;
			System.out.println(i);
		}
	}	
		
		public static boolean makeDecision(int i)
		{
			if(i%3!=0)
			{
				return true;
			}
			else return false;
		}


}
