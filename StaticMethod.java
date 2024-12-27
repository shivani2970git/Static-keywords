package StaticMethod;

public class StaticMethod {
	static int i=10;
	static void add() {
		show();
		System.out.println(i);
	}
	 static void show() {
		System.out.println(1);
	}
	public static void main(String args[]) {
		//StaticMethod st=new StaticMethod();
		add();

	}

}
