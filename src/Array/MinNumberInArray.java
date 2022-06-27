package Array;

public class MinNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				    
			    int a[] = {20,45,10,89,400,350,800};
			    
			    int min = a[0];
			    
			    for(int i=1;i<a.length;i++){
			        if(min>a[i]){
			            min=a[i];
			            
			        }
			        
			    }
			    
			    System.out.println(min);
			}
		

	}


