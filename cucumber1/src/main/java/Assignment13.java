

public class Assignment13 {

	
		static int var=10;
		public void fun()
		{
			System.out.println("static method");
		}
		public static void main(String[] args)
		{
			Assignment13 demo= new Assignment13();
			Assignment13.var=20;
		    demo.fun();
		    System.out.println(var);
			
		}
	}


