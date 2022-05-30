package javaPrograms;

public class NumberTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberoflines =5;
		
		int startingnumber =1;
		
		for(int i=0;i<numberoflines;i++)
			
		{
			
			for(int j=0;j<=i;j++);
			{
				System.out.print(startingnumber+" ");
				startingnumber = startingnumber+1;
				
			}
			
			System.out.println();
		}
		

		
	
		
	}

}
