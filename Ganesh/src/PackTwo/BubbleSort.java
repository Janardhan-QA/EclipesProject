package PackTwo;

public class BubbleSort {

	
static void printArray(int... array){
	    
	   for(int x:array) {
		   System.out.print(x + " ");
	   }
	   System.out.println();
	    
	}
	public static void main(String[] args) {
		int arr[] = { 400, 200, 300, 100 };
		int sizeofarrray= arr.length;
		printArray( arr);
		
		for(int a=0;a<sizeofarrray;a++) {
			
			int temp=0;
			
			
			for(int j=1;j<sizeofarrray-a;j++) {
				
				if(arr[j]<arr[j-1]) {
					temp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
				
			}
		}
		printArray( arr);
		

		
	
	}
}