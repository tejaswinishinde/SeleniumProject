

public class Assignment12 {

	
	int i=10;;
	static int j=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment12 t = new Assignment12();
		System.out.println(t.i);
		System.out.println(t.j);
		System.out.println(j);
		t.non_static();
		//non_static();             // cannot make static ref to nonstatic method
		 t.static1();
		
	}
	public void non_static()
	{
		System.out.println("non_static");
	}
	public static void static1()
	{
		System.out.println("static1");
	}

}
