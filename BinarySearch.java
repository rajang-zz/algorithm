import java.util.Scanner;

class BinarySearch{
	
	
	public int search(int[] inputList, int key){
		
		int i=0;
		int j=inputList.length-1;
		int m=0;
		while(i <= j){
			m=(i+j)/2;
			if( key == inputList[m]){
				return m;
			}else
			{
				 if(key < inputList[m]){
					 i=m+1;
				 }
				 else
					 j=m-1;
			 }
			
		}
		return -1;
	}
	
	
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		BinarySearch binarySearch = new BinarySearch();
		
		System.out.println("Enter the data size : ");
		int len = scanner.nextInt();
		int[] data = new int[len];
		
		System.out.println("Enter the data in sorted order : ");
		
		while(len > 0){
			
			data[len-1] = scanner.nextInt();
			len--;
		}
		
		System.out.println("Enter the value to  search : ");
		
		if(binarySearch.search(data,scanner.nextInt()) > -1 )
			System.out.println("Found!!" );
		else
			System.out.println("Not Found!!");
		
	}
}

