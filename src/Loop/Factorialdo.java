package Loop;

public class Factorialdo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    int Number = 10;
			    int facto=1;
			    int i=1;
			    
			    do{
			        facto*=i;
			        i++;
			   
			    }while(i<=Number);
			    
				System.out.println("Factorial of "+ Number + " is "+ facto);
			}
		

	}


