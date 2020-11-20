

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1,f3,i,num=7;
		System.out.print(f1 +" " +f2);
		for(i=3;i<=num;++i)
		{
			f3=f1+f2;
			System.out.print(" " +f3);
			f1=f2;
			f2=f3;
		}

	}

}
