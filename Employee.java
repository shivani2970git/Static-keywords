package StaticVariable;

public class Employee {
	int empid;
	String name;
	static String company="TCS";
	Employee(int eid,String nm){
		this.empid=eid;
		this.name=nm;
	}
	void show() {
		System.out.println(empid+" "+name+" "+company);
	}
	public static void main(String args[]) {
		Employee e1=new Employee(1010,"Rajesh Patil");
		Employee e2=new Employee(1020,"Priya Deshmukh");
		Employee e3=new Employee(3030,"Sanjay Verma");
		e1.show();
		e2.show();
		e3.show();
	
	}

}
