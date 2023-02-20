package arrays;

public class Array_default_values {

	public static void main(String[] args) {
		int[] a=new int[10];
		for(int x:a)
			System.out.println(x);
		
		String[] str=new String[20];// null null null
		str[9]="ram";
		for(String s:str)
			System.out.println(s);
	}

}
