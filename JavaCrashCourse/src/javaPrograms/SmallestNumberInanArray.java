package javaPrograms;

public class SmallestNumberInanArray {
	
	
	public static int smallestnumber() {
		
		int givenarray[] = {1,2,3,4,5};
		

int smallvalue = Integer.MAX_VALUE;

for(int i=0;i<givenarray.length;i++) {
	
	if(givenarray[i]<smallvalue) {
		
		smallvalue = givenarray[i];
		
	 
	}
	
	 
	


}
System.out.println("The smallest Values is "+smallvalue);
return smallvalue;

		
	}
	
	
	public static void main(String[] args) {
		
		 
		//SmallestNumberInanArray.smallestnumber();
		System.out.println("The smallest number is "+smallestnumber());
		
	}
	

}
