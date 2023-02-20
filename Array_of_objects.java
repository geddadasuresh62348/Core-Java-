package arrays;

 class Employee{
	
	int eId;
	String eName;
	double eSal;
	
	
	public Employee(int eId, String eName, double eSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}
}
class Student{
	int sId;
	String sName;
	double sMarks;
	
	public Student(int sId, String sName, double sMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sMarks = sMarks;
	}
	
}
public class Array_of_objects {
	
	public static void main(String[] args) {
	
		Employee emp1=new Employee(111,"john",1000.23);
		Employee emp2=new Employee(222,"kathy",1034.23);
		Employee emp3=new Employee(333,"karan",1200.23);
		Employee emp4=new Employee(444,"krish",1040.23);
		
		Employee[] e=new Employee[4];
		e[0]=emp1;
		e[1]=emp2;
		e[2]=emp3;
		e[3]=emp4;
		
		for(Employee emp:e)
		System.out.println(emp.eId +" "+emp.eName+" "+emp.eSal);
		
		Student[] std=new Student[4];
		std[0]=new Student(1,"vasu",45);
		std[1]=new Student(2,"varun",54);
		std[2]=new Student(3,"vanajakshi",75);
		
		for(Student st:std) {
			if(st==null) {
				System.out.println(st);
			}
			else {
				
				System.out.println(st.sId+" "+st.sName+" "+st.sMarks);
			}
		}
	}

}
