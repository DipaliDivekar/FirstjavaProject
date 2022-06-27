package string;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						StringReverse obj_m = new StringReverse();
				obj_m.rev_Str("hello welcome to java programme");
			}

		void rev_Str(String s){
		    String str_rev="";
		    int str_length = s.length();     
		    // System.out.println(str_length); 
		    for(int i=s.length()-1;i>=0;i--){
		        // System.out.println(s.charAt(i));
		        str_rev=str_rev+s.charAt(i);
		       
		   }
		     System.out.print(str_rev);
		}
		
	}


