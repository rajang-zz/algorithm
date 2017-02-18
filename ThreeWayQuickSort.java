class ThreeWayQuickSort{


	public static void sort(int data[], int low,int hi){
		
		if(low>=hi) return;
		
		int i=low;
		int lw=low;
		int j=hi;
		int key=data[low];
		
		while(i<=j){
			
			if(data[i] < key){
				int tmp = data[i];
				data[i]=data[lw];
				data[lw]=tmp;
				lw++;
				i++;
			}else if(data[i] > key){
				int tmp =data[j];
				data[j] = data[i];
				data[i] = tmp;
				j--;
			}else if(data[i] == key){
				i++;
			}
			
		}
		
		
		sort(data,low,lw-1);
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
		int[] data = {44,3,11,9,55,6,3,45,0,34};
		//int[] aux = new int[len];
		
		sort(data,0,9);
		
		for(int p:data)
			System.out.println(p);
		
		
	}


}

