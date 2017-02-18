class QuickSort{


	public static int partition(int[] data, int low, int hi){
		
		int i=low+1;
		int j=hi;
		
		while(true){
			
		
			while(data[i] > data[low]) { if(i >= hi) break; i++;}
			while(data[j] < data[low]) { if(j <= low) break; j--;}
	
			if(i>=j){
		
				int temp = data[j];
				data[j] = data[low];
				data[low]=temp;
		
				return j;
			}else{
				int temp = data[i];
				data[i]=data[j];
				data[j] = temp;
			}
		}
			
	}
	
	
	public static void sort(int data[], int low,int hi){
		
		if(low==hi) return;
		int j = partition(data,low,hi);
		sort(data,low,j);
		sort(data,j+1,hi);
		
	}



	public static void main(String[] args){
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the data size : ");
		int len = scanner.nextInt();
		int[] dat = new int[len];
		
		System.out.println("Enter the data : ");
		
		for(int i=0; i<len;i++)
			
			dat[i] = scanner.nextInt();
		
	 */
		int[] data = {44,3,11,9,55,6,33,45,0,34};
		//int[] aux = new int[len];
		
		sort(data,0,9);
		
		for(int p:data)
			System.out.println(p);
		
		
	}


}

