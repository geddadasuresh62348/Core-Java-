package arrays;
public class Arrays1 {

	public static void main(String[] args) {
		int[] a= {10,23};
		System.out.println(a); //[I@76ed5528
		System.out.println(a[0]);
		
		// print all the elements
		for(int i=0;i<a.length;i++)
			System.out.println(a[i] +" ");
		
		// for-each loop
		for(int x:a)
			System.out.println(x +" ");
	}

}
