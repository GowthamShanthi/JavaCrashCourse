package constructors;

public class ParameterizedConstructorEx {

	String Animal_Name;
	String Animal_Type;
	
	
	ParameterizedConstructorEx(String name,String type){
		
		Animal_Name = name;
		
		Animal_Type = type;
		
		
		
	}
	
	
	public void sayaboutAnimal () {
		
		System.out.println("The animal Name is \t"+Animal_Name +"The Animal Type is \t "+Animal_Type);
		
	}
	
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConstructorEx Animal1 = new ParameterizedConstructorEx("Cow", "Herbivores");
		ParameterizedConstructorEx Animal2 = new ParameterizedConstructorEx("Karadi", "Omnivores");
		
		Animal1.sayaboutAnimal();
		Animal2.sayaboutAnimal();
		

	}

}
