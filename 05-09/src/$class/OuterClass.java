package $class;

public class OuterClass {
	private String secret = "secret";
	String s = "outer";
	class InnerClass {
		String s ="inner";
		public void show1() {
			System.out.println("inner class");
			System.out.println(secret);
			System.out.println(s);
			System.out.println(OuterClass.this.s);
		}
}}
