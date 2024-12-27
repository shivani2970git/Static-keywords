package StaticVariable;

public class Student {
	int rollno;
	String name;
	static String clg="TKIET";
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+clg);
	}
	public static void main(String args[]) {
		Student s1=new Student(1,"pooja");
		Student s2=new Student(2,"Jay");
		Student s3=new Student(3,"Raj");
		s1.display();
		s2.display();
		s3.display();
				
	}
	

}
