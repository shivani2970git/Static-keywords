package StaticMethod;

public class Test {
	static void show() {
		//System.out.println("Without Static Method");
		System.out.println("With Static method");
	}
	static void display() {
		System.out.println("this is another non static method");
	}
	
	public static void main(String args[]) {
		//Test t=new Test();
		//t.show();
		show();
		display();
		XYZ.add();
		//add();
	   
		
	}
	static class XYZ{
		static void add() {
			System.out.println("This is non Static method outside the class");
			
		}
	}
}
