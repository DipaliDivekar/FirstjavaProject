package Array;

public class AdditionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
			//code for addition of numbers in array
			int b[] = {23,100,45,78,29,67,38};
			addArray a=new addArray();
			int result=a.add(b);
			System.out.println("Addition of array is" +' '+result);
			    
			}
		}

		class addArray{
		    
		int add(int a[]){
		    
		    int result = 0;
		    for(int i=0;i<a.length;i++){
		        result+=a[i];
		    }
		     return result;    
		    }    
		

	}


