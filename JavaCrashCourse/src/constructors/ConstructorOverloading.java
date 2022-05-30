package constructors;

public class ConstructorOverloading {


	String todraw;
	String twodraw;


	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub

		System.out.println("This is a simple constructor with no arguments ");
	}

	public ConstructorOverloading(String draw1) {
		// TODO Auto-generated constructor stub

		System.out.println("This construcor have only one parameter and the drawing is "+draw1);

	}



	public ConstructorOverloading(String draw1,String draw2) {
		// TODO Auto-generated constructor stub
		System.out.println("This Construcot have two parameters and the the drwaing is "+todraw+"And the another draw is "+twodraw);

	}



	public static void main(String[] args) {

		ConstructorOverloading drawing = new ConstructorOverloading();
		ConstructorOverloading drawing1 = new ConstructorOverloading("Circle");
		ConstructorOverloading drwaing2 = new ConstructorOverloading("Triangle", "Rectangle");


	}


}
