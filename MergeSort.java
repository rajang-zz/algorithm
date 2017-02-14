class MergeSort{
	
	
	
	public static void merge(int[] data,int[] aux, int lo,int mid,int hi){
		
		int i = lo;
		int j=mid+1;
		int k=0;
		while(k < hi){

			System.out.println(i + " " +j + " "+hi + " " +k);	
			if(j > hi) 
				aux[k++] = data[i++];
			else if( i > mid)
				aux[k++] = data[j++];
			else if(data[i] < data[j]) 
				aux[k++] = data[i++];
			else 
				aux[k++] = data[j++];
			
		}
	}
		
	public static void sort(int[] data, int[] aux, int lo, int hi){
		
		if(lo == hi) return;
		int mid =(lo+hi)/2;
		sort(data,aux,lo,mid);
		sort(data,aux,mid+1,hi);
		merge(data,aux,lo,mid,hi);
		
	}
		
		
	

	public static void main(String[] args){
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the data size : ");
		int len = scanner.nextInt();
		int[] data = new int[len];
		
		System.out.println("Enter the data in sorted order : ");
		
		while(len > 0){
			
			data[len-1] = scanner.nextInt();
			len--;
		}*/
		
		int[] data = {44,3,11,9};
		int[] aux = new int[4];
		
		sort(data,aux,0,3);
		
		for(int i:aux)
			System.out.println(i);
		
		
	}
	
}