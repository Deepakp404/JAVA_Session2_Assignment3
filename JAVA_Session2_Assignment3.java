
public class JAVA_Session2_Assignment3 
{
	public static void main(String[] args) 
	{
		String printout = "";
		
		for(int i = 1; i <= 5; i++){
			printout = printout + i;
			System.out.println(printout);		
			
		}		
		for(int count = 5; count > 0; count--){
			printout = "";
			for(int j = 1; j < count; j++){
				printout = printout + j;
			}
			System.out.println(printout);
		}
	}

}
