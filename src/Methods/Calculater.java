package Methods;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			//code for addition
				addition ad = new addition();
				int resultOfAddition= ad.add(34,89);
				System.out.println("Result of addition is" + ' '+resultOfAddition);
			
			//code for substraction
				substraction sb = new substraction();
				int resultOfSubstraction= sb.sub(1000,300);
				System.out.println("Result of Substraction is" + ' '+resultOfSubstraction);
			//code for division
			    division d=new division();
			    float resultOfDivision =d.div(93,6);
			    System.out.println("Result of division is" + ' '+resultOfDivision);
			//code for multiplication
			   multiplication m=new multiplication();
			   float resultOfMultiplication = m.mul(20.4F,5F);
			    System.out.println("Result of Multiplication is" + ' '+resultOfMultiplication);
			   
			   //code for remainder 
			    remainder r = new remainder();
			    int resultOfRemainder = r.rem(389,3);
			    System.out.println("Result of remainder is"+' '+resultOfRemainder);
			}
		}

		class addition{
		  int add(int val1,int val2){
		       return(val1+val2);
		      }  
		    }
		 class substraction{
		  int sub(int val1,int val2){
		       return(val1-val2);
		      }  
		    }   
		   
		   class division{
		       float div(int val1,int val2){
		           return(val1/val2);
		           } 
		    }
		    
		    class multiplication{
		        float mul(float val1, float val2){
		            return(val1*val2);
		        }
		    }
		    
		    class remainder{
		        int rem(int val1,int val2){
		            return(val1%val2);
		        }
		    
	}

