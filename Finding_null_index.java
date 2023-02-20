package arrays;

public class Finding_null_index {

	public static void main(String[] args) {
		String[] s=new String[5];
		s[0]="a";
		s[3]="b";
		
		for(int i=0;i<s.length;i++) {
			if(s[i]==null)
				System.out.println(i);
		}
	}

}
