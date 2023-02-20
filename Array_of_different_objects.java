package arrays;

class Parent{
	
}
class Child extends Parent{

}
class GrandChild extends Child{
	
}
public class Array_of_different_objects {

	public static void main(String[] args) {
		
		Parent[] p=new Parent[3];
		
		p[0]=new Child();
		p[1]=new Parent();
		p[2]=new GrandChild();
		
		for(Parent i:p)
			System.out.println(i);
	}

}
