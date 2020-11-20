

public class Assignment5 {
	public static void main(String[] args) {
		String arr1[]= new String[3];
		String arr2[]= new String[3];
		arr1[0]="1";
		arr1[1]="2";
		arr1[2]="3";
		
		arr2[0]="A";
		arr2[1]="B";
		arr2[2]="C";
		
		printAll(arr1);
		printAll(arr2);
	}		
		public static void printAll(String str[])
		{
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[i]);
			}
		}
	}


