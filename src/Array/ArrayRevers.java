package Array;

public class ArrayRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//code for addition of numbers in array
			int b[] = {23,100,45,35,56,22,78,29,67,38};
			reverseArray a=new reverseArray();
			int revArray[]=a.reverse(b);
		    for(int j=0;j<revArray.length;j++){
		        System.out.print(revArray[j]);
		        System.out.print(" ");
		    }
			}
		}
		class reverseArray{
		 int[] reverse(int a[]){
		    int length= a.length;
		    int mid = length/2;
		    int last=length-1;
		    System.out.println("length of array is" + ' ' +length);
		    System.out.println("mid value is"+ ' '+mid);
		   for(int i=0;i<a.length;i++){
		     if(last>mid){
		        int swap = a[i];
		         a[i]=a[last];
		         a[last]=swap;
		         last--;
		     }    
		   }
		    return a;    
		    }    
		
	}


