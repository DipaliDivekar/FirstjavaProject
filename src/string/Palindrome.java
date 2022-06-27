package string;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    String str1 ="nitin";
				//String str1 ="Tanish";
			    Palindrome obj_m = new Palindrome ();
				String str_Reverse=obj_m.rev_Str(str1);
			    obj_m.palindrome(str1,str_Reverse);
				
			}

		    String rev_Str(String s){
		             String str_rev="";
		             int str_length = s.length();     
		             // System.out.println(str_length); 
		                 for(int i=s.length()-1;i>=0;i--){
		                    // System.out.println(s.charAt(i));
		                    str_rev=str_rev+s.charAt(i);
		                  }
		     System.out.println(str_rev);
		     return(str_rev);
		   }
		   
		   void palindrome(String str1,String str2){
		           if((str1.equals(str2))==true){
		           System.out.println("String "+str1 +" is palindrome");
		       }
		           else {
		        	   System.out.println("String "+str1 +" is not palindrome");
		           }
		           
		   }
		}
	


