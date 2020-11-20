

public class Assignment11 {

	int i=10;
	static int j=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment11 t = new Assignment11();
//		t.i=10;
//		t.j=20;
//		j=30;
		t.test1();
		test2();
		System.out.println(t.i);
		System.out.println(t.j);
		System.out.println(j); 
//		System.out.println(i);     // field is nonststatic so should not give ref in static method
//		t.test3();     // undefined
	}	
		public  void test1()
		{
			System.out.println("test1");
		}
		public static void test2()
		{
			System.out.println("test2");
		}
		
	}


