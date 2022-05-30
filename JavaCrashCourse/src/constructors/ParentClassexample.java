package constructors;

public class ParentClassexample {
	
	String name  = "gowtham";
 
	String fathersname;
	
	public ParentClassexample() {

 	name = "Gowtham";
 	fathersname = "vaalgavae";
		
	}
	
	public ParentClassexample(String gname,String vfathersname) {
		
	name = gname;
	fathersname = vfathersname;
		
		
		
	}
	
	
	public static  void name() {
		
		System.out.println("The is from parent  Name method is "+name);
		
	}
	
	public void tester() {
		
		System.out.println("This is from parent class");
		
	}
	
	public void printnbothname() {
		
 
		
		System.out.println("The name is "+name);
		System.out.println("The Father's name is "+fathersname);
		
		
		
	}
	
	
	public int sumvalue(  ) {
		
		int a = 5;
		int b = 10;
		int c= a+b;
		return c;
		
	}
	
	
	
	public static void main(String[] args) {
		
		ParentClassexample example = new ParentClassexample("gows", "vels");
		example.printnbothname();
		
		
	}
	

}
