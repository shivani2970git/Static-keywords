package StaticBlock;

public class StaticBlock {
	 static int a;
	static {
		a=10;
		System.out.println(a);
	}
	static {
		System.out.println("this is static block");
	}
	static {
		System.out.println("used whih static keyword");
	}
	public static void main(String args[]){
		System.out.println("This is main mehtod");
	}

}
