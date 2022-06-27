package string;

public class ChangeNameSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    String str1 ="Dipali Vilas Borkar";
			    ChangeNameSequence obj_m = new ChangeNameSequence();
			    obj_m.change_Sequence(str1);
				
			}

		    void change_Sequence(String s){
		             String [] str_split = s.split(" "); 
		             System.out.print(str_split[2] +" "+str_split[0]+" "+str_split[1]);
		      }
		  
		  
	}


