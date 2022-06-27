package Array;

public class MaxNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					    
			    int a[] = {20,45,10,89,400,350,800};
			    
			    int max = a[0];
			    
			    for(int i=1;i<a.length;i++){
			        if(max<a[i]){
			            max=a[i];
			            
			        }
			        
			    }
			    
			  		System.out.println(max);
			}

	}


