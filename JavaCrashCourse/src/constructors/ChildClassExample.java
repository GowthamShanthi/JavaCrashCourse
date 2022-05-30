package constructors;

public class ChildClassExample extends ParentClassexample {
	
//	static String commonname = "Namachivaya Vaalga";
  //String name = "gowtham v";

	 public ChildClassExample() {
		  

		   name = "gowtham velumani";
		 }

	 
	 public   void name1() {
		
		 System.out.println("The name from the parent class name method is "+super.name);
		 System.out.println("The name from the current class name method is"+this.name);

		 
	}
	 
		
		public void tester() {
			
			System.out.println("This is from child class"+super.name);
			System.out.println(namachivaya);
			
		}
		
		
		public int sumvalue(  ) {
			
			int a = 50;
			int b = 100;
			int c= a+b;
			return c;
			
		}
		
		
	 
	 
	 public static void main(String[] args) {
		
		// System.out.println("The common name is "+commonname);
		 
	 ChildClassExample example = new ChildClassExample();
	 example.name1();
	 example.sumvalue();
			System.out.println("Ths sumvalues is "+example.sumvalue());
		 
		 
	}
 
	 
}
